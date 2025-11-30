package coreInterfaces;

import java.util.function.Supplier;

public class Supplier_14 {

    Supplier<Book> supplier;

    public Supplier_14() {
        Supplier<Book> custom = new BookSupplier();
        Supplier<Book> lambda = () -> new Book("Python Basics", 299.99);

        supplier = custom;
    }

    public static void main(String[] args) {
    	Supplier_14 obj = new Supplier_14();
        Book b = obj.supplier.get();
        System.out.println("Book: " + b.title + ", Price: " + b.price);
    }
}


class Book {
    String title;
    double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
}

class BookSupplier implements Supplier<Book> {

    @Override
    public Book get() {
        return new Book("Java Programming", 499.99);
    }
}
