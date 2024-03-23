package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class MediaRental implements MediaRentallnt {

	// properties.
	private ArrayList<Customer> customer = new ArrayList<Customer>();
	private ArrayList<Media> med = new ArrayList<>();

	// Generate non argument constructors.
	public MediaRental() {
		super();
	}

	// Generate argument constructors.
	public MediaRental(ArrayList<Customer> customer, ArrayList<Media> med) {
		super();
		this.customer = customer;
		this.med = med;
	}

	// Generate setters and getters.
	public ArrayList<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(ArrayList<Customer> customer) {
		this.customer = customer;
	}

	public ArrayList<Media> getMed() {
		return med;
	}

	public void setMed(ArrayList<Media> med) {
		this.med = med;
	}

	// Override toString.
	@Override
	public String toString() {
		return "MediaRental [customer=" + customer + ", med=" + med + "]";
	}

	public void addCustomer(String name, String address, String plan, String id, String mobile_number) {
		customer.add(new Customer(name, address, plan, id, mobile_number));// Add a customer.

	}

	public void addMovie(String title, int copiesAvailable, String rating, String code) {

		if (!rating.equals("DR") && !rating.equals("HR") && !rating.equals("AC")) {// Conditions for rating.
			throw new IllegalArgumentException("It must be DR or HR or AC");// Exception.
		}
		med.add(new Movie(title, copiesAvailable, rating, code));// Add a movie.
	}

	public void addGame(String title, int copiesAvailable, double weight, String code) {

		med.add(new Game(title, copiesAvailable, weight, code));// Add a game.

	}

	public void addAlbum(String title, int copiesAvailable, String artist, String songs, String code) {

		med.add(new Album(title, copiesAvailable, artist, songs, code));// Add an album.

	}

	public void setLimitedPlanLimit(int value) {

		if (value < 1) {// Conditions for the number of media.
			throw new IllegalArgumentException();// Exception when the value less than 2.
		} else {
			Customer.limitedPlanLimit = value;// New value.
		}
	}

	public String getAllCustomersInfo() {
		sortCustomers(customer);// Call the method sortCustomers.
		String str = "";
		for (int i = 0; i < customer.size(); i++) {
			str += customer.get(i).getName() + " " + customer.get(i).getAddress() + " " + customer.get(i).getPlan()
					+ " " + customer.get(i).getId() + " " + customer.get(i).getMobile_number() + "\n";// Information
			// about
			// all
			// customers.
		}
		return str;
	}

	public String getAllMediaInfo() {
		sortMedia(med);// Call the method sortMedia.
		String str = "";
		for (int i = 0; i < med.size(); i++) {
			str += med.get(i).toString() + "\n";// Information about all media.
		}
		return str;
	}

	private void sortCustomers(ArrayList<Customer> customer) {// Function to sort the information by customer name.
		for (int i = 0; i < customer.size() - 1; i++) {
			for (int j = i + 1; j < customer.size(); j++)
				if (customer.get(i).getName().compareTo(customer.get(j).getName()) > 0) { // If the first name large
																							// than the second.
					Collections.swap(customer, i, j);// Swapping two values.
				}
		}
	}

	private void sortMedia(ArrayList<Media> med) {// Function to sort the information by media title.
		for (int i = 0; i < med.size() - 1; i++) {
			for (int j = i + 1; j < med.size(); j++)
				if (med.get(i).getTitle().compareTo(med.get(j).getTitle()) > 0) {// If the first title large than the
																					// second.
					Collections.swap(med, i, j);// Swapping two values.
				}
		}
	}

	public boolean addToCart(String id, String code) {

		int cIndex = customerExist(id);
		int mIndex = mediaExist(code);

		if (cIndex == -1)
			return false;// The customer id is not exist in the media.

		if (mIndex == -1)
			return false;// The media code is not exist in the media.

		for (int i = 0; i < customer.get(cIndex).getReceiving().size(); i++) {
			if (customer.get(cIndex).getReceiving().get(i).equals(code))// Check if the media code is in the
																		// cart.
				return false;
		}

		customer.get(cIndex).getReceiving().add(code);// Add media to the cart.

		return true;

	}

	public int customerExist(String id) { // To check if customer id is exist in the media.

		int a = -1;
		for (int i = 0; i < customer.size(); i++) {
			if (customer.get(i).getId().equals(id)) {
				a = i;
				break;// Exit from the for loop.
			}
		}
		return a;
	}

	public int mediaExist(String code) {// To check if the media code is exist in the media.
		int a = -1;
		for (int i = 0; i < med.size(); i++) {
			if (med.get(i).getCode().equals(code)) {
				a = i;
				break;// Exit from the for loop.
			}
		}
		return a;
	}

	public boolean removeFromCart(String id, String code) {// Remove the media from cart.

		int cIndex = customerExist(id);
		int mIndex = mediaExist(code);

		if (cIndex == -1)// Check The customer id is exist in the media.
			return false;

		if (mIndex == -1)// Check The media code is exist in the media.
			return false;
		return customer.get(cIndex).getReceiving().remove(code);// Remove media from cart.

	}

	public String processRequests() {// Move the media from receiving to rented list.
		String s = "";

		sortCustomers(customer);// Call the method sortCustomers.

		for (int i = 0; i < customer.size(); i++) {
			for (int j = 0; j < customer.get(i).getReceiving().size(); j++) {
				int mIndex = mediaExist(customer.get(i).getReceiving().get(j));
				if (customer.get(i).getPlan().equals("LIMITED")) {// Check if the plan LIMITED.
					if (customer.get(i).getRented().size() < Customer.limitedPlanLimit) {
						if (med.get(mIndex).getCopiesAvailbale() > 0) {
							s += "sending " + med.get(mIndex).getTitle() + " to " + customer.get(i).getName();
							customer.get(i).getRented().add(customer.get(i).getReceiving().get(j));
							customer.get(i).getReceiving().remove(j);
							med.get(mIndex).setCopiesAvailbale(med.get(mIndex).getCopiesAvailbale() - 1);

						} else
							s += "There is no copies available";
					} else
						s += "you cant rent more than two media";

				}

				if (customer.get(i).getPlan().equals("UNLIMITED")) {// Check if the plan UNLIMITED.
					if (med.get(mIndex).getCopiesAvailbale() > 0) {
						s += "sending " + med.get(mIndex).getTitle() + " to " + customer.get(i).getName();
						customer.get(i).getRented().add(customer.get(i).getReceiving().get(j));
						customer.get(i).getReceiving().remove(j);
						med.get(mIndex).setCopiesAvailbale(med.get(mIndex).getCopiesAvailbale() - 1);
					} else
						s += "There is no copies available\n";

				}
			}
		}

		return s;
	}

	public boolean returnMedia(String id, String code) {// Remove the media from rented list.
		if (mediaExist(code) == -1)// Check if the media code is exist.
			return false;
		if (customerExist(id) == -1) {// Check if the customer ID is exist.
			return false;
		}

		int cIndex = customerExist(id);
		int mIndex = mediaExist(code);

		for (int i = 0; i < customer.get(cIndex).getRented().size(); i++) {
			if (customer.get(cIndex).getRented().get(i).equals(code)) {
				customer.get(cIndex).getRented().remove(i);
				med.get(mIndex).setCopiesAvailbale(med.get(mIndex).getCopiesAvailbale() + 1);
				return true;
			}
		}
		return false;
	}

	public ArrayList<String> searchMedia(String title, String rating, String artist, String songs) {// Search for
																									// the media
																									// that satisfy
																									// some
																									// conditions.

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < med.size(); i++) {
			if (!rating.equals("")) { // If rating not "", the result must be a Movie.
				if (med.get(i).getTitle().equals(title) || title.equals(""))
					if (med.get(i) instanceof Movie)
						if (((Movie) med.get(i)).getRating().equals(rating) || rating.equals("")) {
							list.add(med.get(i).getTitle());
						}

			}

			if (!artist.equals("") || !songs.equals("")) {// If an artist or songs not "", the result must be an album.
				if (med.get(i).getTitle().equals(title) || title.equals(""))
					if (med.get(i) instanceof Album)
						if (((Album) med.get(i)).getArtist().equals(artist) || artist.equals(""))
							if (((Album) med.get(i)).getSongs().indexOf(songs) > -1 || songs.equals(""))
								list.add(med.get(i).getTitle());
			}
			if (rating.equals("") && artist.equals("") && songs.equals("")) {
				if (med.get(i).getTitle().equals(title) || title.equals(""))
					list.add(med.get(i).getTitle());
			}
		}

		return list;
	}

	public boolean deleteCustomer(String id) {// Delete the customer according to his ID.

		int index = customerExist(id);// Call the method to check if the customer id is exist.

		if (index > -1) {
			customer.remove(index);// Remove customer information.
			return true;// Removed.
		}

		return false;// Not removed.
	}

	public boolean deleteMedia(String code) {// Delete the media according to it's code.
		int index = mediaExist(code);// Call the method to check if the media code is exist.
		if (index > -1) {
			med.remove(index);// Removed media information
			return true;// Removed.
		}

		return false;// Not removed.

	}

}
