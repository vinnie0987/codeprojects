package dev.lpa;

public class Book {
    String name;
    int pages;
    double price;

    public Book(String name, int pages, double price) {
        this.name = name;
        this.pages = pages;
        this.price = price;
    }
}

class Node {
    Book book;
    Node next;

    public Node(Book book) {
        this.book = book;
        this.next = null;
    }
}

