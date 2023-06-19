package dev.lpa;

public class BookLinkedList {
    private Node head;

    public void insert(Book book) {
        Node newNode = new Node(book);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Book search(String name) {
        Node current = head;
        while (current != null) {
            if (current.book.name.equals(name)) {
                return current.book;
            }
            current = current.next;
        }
        return null;
    }

    public void printAllBooks() {
        Node current = head;
        while (current != null) {
            System.out.println("Name: " + current.book.name + ", Pages: " + current.book.pages + ", Price: " + current.book.price);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        BookLinkedList bookList = new BookLinkedList();

        // Inserting books
        bookList.insert(new Book("Book 1", 200, 10.99));
        bookList.insert(new Book("Book 2", 350, 15.99));
        bookList.insert(new Book("Book 3", 150, 7.99));
        // ... Inserting the remaining books

        // Searching a book
        Book searchedBook = bookList.search("Book 2");
        if (searchedBook != null) {
            System.out.println("Book found: " + searchedBook.name);
        } else {
            System.out.println("Book not found.");
        }

        // Printing all books
        bookList.printAllBooks();
    }
}
