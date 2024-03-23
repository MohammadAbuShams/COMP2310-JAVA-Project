package application;

import java.util.Arrays;

public class Album extends Media implements Comparable<Album> {

	// properties.
	private String artist;
	private String songs;

	// Generate non argument constructor.
	public Album() {
		super();
	}

	// Generate an argument constructor.
	public Album(String title, int copiesAvailbale, String artist, String songs, String code) {
		super(title, copiesAvailbale, code);
		this.artist = artist;
		this.songs = songs;
	}

	// Generate setters and getters.
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSongs() {
		return songs;
	}

	public void setSongs(String songs) {
		this.songs = songs;
	}

	// Override toString.
	@Override
	public String toString() {
		return "Album [Code=" + getCode() + ", Title=" + getTitle() + ", Number_of_copies=" + getCopiesAvailbale()
				+ ", artist=" + artist + ", songs=" + songs + "]";
	}

	// Method CompareTo for the title of Album.
	@Override
	public int compareTo(Album o) {
		return this.getTitle().compareTo(((Album) o).getTitle());
	}

}
