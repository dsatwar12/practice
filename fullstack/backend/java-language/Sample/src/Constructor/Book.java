package Constructor;

public class Book  {
	String title;

String author;

// Parameterized constructor
Book(String t, String a) {
    title = t;
    author = a;
}

// Copy constructor
Book(Book b) {
    title = b.title;
    author = b.author;
}

void display() {
    System.out.println("Title: " + title + ", Author: " + author);
}

public static void main(String[] args) {
    Book b1 = new Book("Java Programming", "James Gosling");
    Book b2 = new Book(b1);  // Using the copy constructor
    b1.display();
    b2.display();
}
}