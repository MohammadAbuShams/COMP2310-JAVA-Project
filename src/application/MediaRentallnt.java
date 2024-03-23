package application;

import java.util.ArrayList;

// All the Methods.
public interface MediaRentallnt {

	void addCustomer(String name, String address, String plan, String id, String mobile_number);

	void addMovie(String title, int copiesAvailable, String rating, String code);

	void addGame(String title, int copiesAvailable, double weight, String code);

	void addAlbum(String title, int copiesAvailable, String artist, String songs, String code);

	void setLimitedPlanLimit(int value);

	String getAllCustomersInfo();

	String getAllMediaInfo();

	boolean addToCart(String customerName, String mediaTitle);

	boolean removeFromCart(String customerName, String mediaTitle);

	String processRequests();

	boolean returnMedia(String customerName, String mediaTitle);

	ArrayList<String> searchMedia(String title, String rating, String artist, String songs);

	boolean deleteCustomer(String id);

	boolean deleteMedia(String code);

}
