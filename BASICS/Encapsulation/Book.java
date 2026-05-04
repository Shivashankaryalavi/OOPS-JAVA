package Encapsulation;

public class Book {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;

        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
            this.price = 0;
        }

        this.available = available;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    public void borrowBook() {
        if(available) {
            available = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Not available");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println("Book returned");
    }

    public void display() {
        System.out.println(title + " | " + author + " | " + price + " | " + available);
    }
    public static void main(String[] args) {

        Book b1 = new Book("Java", "James", 500, true);
        b1.display();
        b1.borrowBook();
        b1.returnBook();
        b1.setPrice(-10);
        b1.display();
}}