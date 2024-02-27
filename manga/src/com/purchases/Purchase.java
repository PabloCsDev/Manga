package com.purchases;
import java.util.Scanner;

import com.manga.Manga;

public class Purchase {
    private Manga manga;
    private int quantity;
    private double totalPrice;

    public Purchase(Manga manga, int quantity, double totalPrice) {
        this.manga = manga;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public void displayInfo() {
        System.out.println("Manga Title: " + manga.getTitle());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the manga title: ");
        String mangaTitle = scanner.nextLine();
        System.out.print("Enter the author: ");
        String author = scanner.nextLine();
        System.out.print("Enter the genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter the number of volumes: ");
        int numberOfVolumes = scanner.nextInt();
        scanner.nextLine();

        Manga onePiece = new Manga(mangaTitle, author, genre, numberOfVolumes);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the total price: $");
        double totalPrice = scanner.nextDouble();

        Purchase purchase1 = new Purchase(onePiece, quantity, totalPrice);

        System.out.println("Manga Information:");
        onePiece.displayInfo();

        System.out.println("\nPurchase Information:");
        purchase1.displayInfo();
    }
}
