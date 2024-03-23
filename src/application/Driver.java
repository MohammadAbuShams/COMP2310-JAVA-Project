package application;

import java.util.*;
import java.io.*;

public class Driver {

	public static void main(String[] args) {

		MediaRental m = new MediaRental();// Create an object m of MediaRental.

		readInfo(m);// Read the previous information from the file.

		Scanner in = new Scanner(System.in);

		File customer, media, cart, rented;
		customer = new File("customer.txt");
		media = new File("media.txt");
		cart = new File("cart.txt");
		rented = new File("rented.txt");

		System.out.println("enter a number from 1-9");
		while (true) {

			System.out.println("1- add customer \n2- add media \n3- add to cart \n4- remove from cart \n"
					+ "5- proccessing request one\n6- prccessing request two \n7- Return media \n"
					+ "8- Search media \n9- Exit and Save");
			int n = 0;
			try {
				n = in.nextInt();// n must be an integer.
			} catch (InputMismatchException e) {
				System.out.println(e);// Exception if n not an integer.
			}

			if (n == 1)
				testAddingCustomers(m);// Call the first method.
			else if (n == 2) {
				System.out.println("1- Album \n2- Game \n3- Movie");
				try {
					int a = in.nextInt();// a must an be integer.
					testAddingMedia(m, a);// Call the second method.
				} catch (InputMismatchException e) {
					System.out.println(e);// Exception if a not an integer.
				}
			} else if (n == 3)
				testingAddingToCart(m);// Call the third method.
			else if (n == 4)
				testingRemovingFromCart(m);// Call the fourth method.
			else if (n == 5)
				testProcessingRequestsOne(m);// Call the fifth method.
			else if (n == 6)
				testProcessingRequestsTwo(m);// Call the sixth method.
			else if (n == 7)
				testReturnMedia(m);// Call the seventh method.
			else if (n == 8)
				testSearchMedia(m);// Call the eighth method.
			else {

				try {
					FileWriter cwriter = new FileWriter(customer);
					FileWriter mwriter = new FileWriter(media);
					FileWriter cartWriter = new FileWriter(cart);
					FileWriter rentWriter = new FileWriter(rented);

					for (int i = 0; i < m.getCustomer().size(); i++) {// Print all information in four files.
						Customer c = m.getCustomer().get(i);
						cwriter.write(c.getName() + ";" + c.getAddress() + ";" + c.getPlan() + ";" + c.getReceiving()
								+ ";" + c.getRented() + "\n");
						for (int j = 0; j < c.getReceiving().size(); j++) {
							cartWriter.write(c.getName() + ";" + c.getReceiving().get(j) + "\n");
						}
						for (int j = 0; j < c.getRented().size(); j++) {
							rentWriter.write(c.getName() + ";" + c.getRented().get(j) + "\n");
						}

					}
					for (int i = 0; i < m.getMed().size(); i++) {// Print media information.
						Media a = m.getMed().get(i);
						mwriter.write(a.getTitle() + ";" + a.getCopiesAvailbale() + ";");
						if (a instanceof Movie)
							mwriter.write(((Movie) a).getRating() + ";Movie" + "\n");
						else if (a instanceof Album)
							mwriter.write(((Album) a).getArtist() + ";" + ((Album) a).getSongs() + ";Album" + "\n");
						else if (a instanceof Game) {
							mwriter.write(((Game) a).getWeight_in_gram() + ";Game" + "\n");

						}
					}
					cwriter.close();// Close files.
					mwriter.close();
					cartWriter.close();
					rentWriter.close();
				} catch (IOException e) {
					System.out.println(e);
				}

				System.exit(0);// Exit from the program.

			}
		}
	}

	public static void testAddingCustomers(MediaRental m) {// Add a customer.
		Scanner in = new Scanner(System.in);
		System.out.println("enter name, address, plan");
		String name = in.next();
		String address = in.next();
		String plan = in.next();
		String id = in.next();
		String mobile_number = in.next();
		try {
			m.addCustomer(name, address, plan, id, mobile_number);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
	}

	public static void testAddingMedia(MediaRental m, int a) {// Add an media.
		Scanner in = new Scanner(System.in);

		if (a == 1) {// Add an album.
			try {
				System.out.println("enter media title, copies Available, artist, songs");

				String title = in.next();
				int copiesAvailable = in.nextInt();
				String artist = in.next();
				String songs = in.next();
				String code = in.next();
				m.addAlbum(title, copiesAvailable, artist, songs, code);
			} catch (InputMismatchException e) {
				System.out.println(e);
			}
		} else if (a == 2) {// Add a game.
			try {
				System.out.println("enter media title, copies Available, weight");
				String title = in.next();
				int copiesAvailable = in.nextInt();
				double weight = in.nextDouble();
				String code = in.next();
				m.addGame(title, copiesAvailable, weight, code);
			} catch (InputMismatchException e) {
				System.out.println(e);
			}

		} else if (a == 3) {// Add a movie.
			try {
				System.out.println("enter media title, copies Available, rating");

				String title = in.next();
				int copiesAvailable = in.nextInt();
				String rating = in.next();
				String code = in.next();
				m.addMovie(title, copiesAvailable, rating, code);
			} catch (InputMismatchException e) {
				System.out.println(e);
			} catch (IllegalArgumentException e) {
				System.out.println(e);
			}

		}
	}

	public static void testingAddingToCart(MediaRental m) {// Adding media to cart.
		System.out.println("enter customer name and media title");

		Scanner in = new Scanner(System.in);
		String name = in.next();
		String title = in.next();
		System.out.println(m.addToCart(name, title));
	}

	public static void testingRemovingFromCart(MediaRental m) {// Removing media from cart.
		System.out.println("enter customer name and media title");

		Scanner in = new Scanner(System.in);
		String name = in.next();
		String title = in.next();
		System.out.println(m.removeFromCart(name, title));
	}

	public static void testProcessingRequestsOne(MediaRental m) {// Move the media from cart to rented.

		System.out.println(m.processRequests());

	}

	public static void testProcessingRequestsTwo(MediaRental m) {
		System.out.println(m.processRequests());
	}

	public static void testReturnMedia(MediaRental m) {// Remove the media from the rented.
		System.out.println("enter customer name and media title");

		Scanner in = new Scanner(System.in);
		String name = in.next();
		String title = in.next();
		System.out.println(m.returnMedia(name, title));

	}

	public static void testSearchMedia(MediaRental m) {// Search for media.

		Scanner in = new Scanner(System.in);
		System.out.print("enter media title: ");
		String title = in.nextLine();
		System.out.print("rating: ");
		String rating = in.nextLine();
		System.out.print("artist: ");
		String artist = in.nextLine();
		System.out.print("songs: ");
		String songs = in.nextLine();

		System.out.println(m.searchMedia(title, rating, artist, songs));
	}

	public static void readInfo(MediaRental m) {// Read the information from the file.
		File customer, media, cart, rented;
		customer = new File("customer.txt");
		media = new File("media.txt");
		cart = new File("cart.txt");
		rented = new File("rented.txt");
		if (customer.exists())// Check if the customer file exist.
			try {
				Scanner customerR = new Scanner(customer);

				while (customerR.hasNextLine()) { // Keep reading lines until the end of the file.
					String[] s = customerR.nextLine().split(";");// Split the information in the file by semicolon.
					String name = s[0];
					String address = s[1];
					String plan = s[2];
					String id = s[3];
					String mobile_number = s[4];
					m.addCustomer(name, address, plan, id, mobile_number);
				}
			} catch (FileNotFoundException e) {
				e.getMessage();
			}

		if (media.exists())// Check if the media file exist.
			try {
				Scanner mediaR = new Scanner(media);

				while (mediaR.hasNextLine()) {// Keep reading lines until the end of the file.
					String[] s = mediaR.nextLine().split(";");
					String title = s[0];
					String copyAvailable = s[1];
					String code = s[3];
					if (s[s.length - 1].equals("Movie")) {
						String rating = s[2];
						m.addMovie(title, Integer.parseInt(copyAvailable), rating, code);
					}

					else if (s[s.length - 1].equals("Album")) {
						String artist = s[2];
						String songs = s[3];
						m.addAlbum(title, Integer.parseInt(copyAvailable), artist, songs, code);
					} else if (s[s.length - 1].equals("Game")) {
						String weight = s[2];
						m.addGame(title, Integer.parseInt(copyAvailable), Double.parseDouble(weight), code);
					}

				}
			} catch (FileNotFoundException e) {
				e.getMessage();
			}

		if (cart.exists())// Check if the media file exist.
			try {

				Scanner cartR = new Scanner(cart);
				while (cartR.hasNextLine()) {
					String[] s = cartR.nextLine().split(";");
					String Name = s[0];
					String title = s[1];
					m.addToCart(Name, title);
				}

			} catch (FileNotFoundException e) {
				e.getMessage();
			}

		if (rented.exists()) {// Check if the rented file exist.
			try {
				Scanner rentedR = new Scanner(rented);
				while (rentedR.hasNextLine()) {
					String[] s = rentedR.nextLine().split(";");
					String Name = s[0];
					for (int i = 0; i < m.getCustomer().size(); i++) {
						if (m.getCustomer().get(i).getName().equals(Name)) {
							for (int j = 1; j < s.length; j++) {
								String title = s[j];
								m.getCustomer().get(i).getRented().add(title);
							}
						}
					}

				}

			} catch (FileNotFoundException e) {
				e.getMessage();
			}
		}

	}

}