package setif;
import java.util.*;

public class TreeSet_3 {
	
    public static void main(String[] args) {
    	
        TreeSet<Book_45> set = new TreeSet<Book_45>(new LengthComparator());
        
        set.add(new Book_45("Java"));
        set.add(new Book_45("Python"));
        set.add(new Book_45("C"));
        set.add(new Book_45("C++"));
        set.add(new Book_45("Machine Learning"));
        set.add(new Book_45("Deep Learning"));
        set.add(new Book_45("Computer Vision"));

        for (Book_45 b : set)
            System.out.println(b.name);
    }
}



class Book_45 implements Comparable<Book_45> {
    String name;

    Book_45(String name) {
        this.name = name;
    }

    public int compareTo(Book_45 b) {
        return name.compareTo(b.name);
    }
}

class LengthComparator implements Comparator<Book_45> {
    public int compare(Book_45 b1, Book_45 b2) {
        return b1.name.length() - b2.name.length();
    }
}