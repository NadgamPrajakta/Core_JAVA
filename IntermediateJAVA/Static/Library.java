package Static;

public class Library {
    static String libraryName = "City Central Library";

    private String bookTitle;
    private String author;

    public Library(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
    }

    // Display method
    public void showBookDetails() {
        System.out.println("Library: " + libraryName + ", Book: " + bookTitle + " by " + author);
    }

    // Static method
    public static void renameLibrary(String newName) {
        libraryName = newName;
    }

    public static void main(String[] args) {
        Library b1 = new Library("Rich Dad Poor Dad", "Robert Kiyosaki");
        Library b2 = new Library("Atomic Habits", "James Clear");

        b1.showBookDetails();
        b2.showBookDetails();

        System.out.println("\n--- Renaming Library ---");
        Library.renameLibrary("Knowledge Hub Library");

        b1.showBookDetails();
        b2.showBookDetails();
    }
}

