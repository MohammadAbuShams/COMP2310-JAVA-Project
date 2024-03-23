package application;

public class Movie extends Media implements Comparable<Movie> {

	// properties.
	private String rating;

	// Generate non argument constructor.
	public Movie() {
		super();
	}

	// Generate an argument constructor.
	public Movie(String title, int copiesAvailbale, String rating, String code) {
		super(title, copiesAvailbale, code);
		this.rating = rating;
	}

	// Generate setters and getters.
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	// Override toString.
	@Override
	public String toString() {
		return "Movie [Code=" + getCode() + ", Title" + getTitle() + ", Number_of_copies=" + getCopiesAvailbale()
				+ ", rating=" + rating + "]";
	}

	// Method CompareTo for the title of Game.
	@Override
	public int compareTo(Movie o) {
		return this.getTitle().compareTo(((Movie) o).getTitle());
	}

}
