
import java.util.Scanner;

class Book {
    int bookId;
    String title;
    double price;

    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[5];
        double sum = 0;

        for (int i = 0; i < books.length; i++) {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Book Price: ");
            double price = sc.nextDouble();

            books[i] = new Book(id, title, price);
            sum += price;
        }

        System.out.println("\nBooks with price greater than 500:");
        for (Book b : books) {
            if (b.price > 500) {
                System.out.println(b.bookId + " " + b.title + " " + b.price);
            }
        }

        double average = sum / books.length;
        System.out.println("\nAverage Price of all books: " + average);

        sc.close();
    }
}
