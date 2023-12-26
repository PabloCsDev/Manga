package com.manga;

public class Manga {
	public static void main(String[] args) {
		
	}
	private String title;
	private String author;
	private String genre;
	private int numberOfVolumes;

	public Manga(String title, String author, String genre, int numberOfVolumes) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.numberOfVolumes = numberOfVolumes;
	}

	public String getTitle() {
		return title;
	}

	public void displayInfo() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Genre: " + genre);
		System.out.println("Number of Volumes: " + numberOfVolumes);
	}
	

	}
	

