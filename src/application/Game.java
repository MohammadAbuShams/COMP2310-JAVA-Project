package application;

public class Game extends Media implements Comparable<Game> {
	// properties.
	private double weight_in_gram;

	// Generate non argument constructor.
	public Game() {
		super();
	}

	// Generate an argument constructor.
	public Game(String title, int copiesAvailbale, double weight_in_gram, String code) {
		super(title, copiesAvailbale, code);
		this.weight_in_gram = weight_in_gram;

	}

	// Generate setters and getters.
	public double getWeight_in_gram() {
		return weight_in_gram;
	}

	public void setWeight_in_gram(double weight_in_gram) {
		this.weight_in_gram = weight_in_gram;
	}

	// Override toString.
	@Override
	public String toString() {
		return "Game [Code=" + getCode() + ", Title=" + getTitle() + ", Number_of_copies=" + getCopiesAvailbale()
				+ ", weight_in_gram=" + weight_in_gram + "]";
	}

	// Method CompareTo for the title of Game.
	@Override
	public int compareTo(Game o) {
		return this.getTitle().compareTo(((Game) o).getTitle());
	}
}
