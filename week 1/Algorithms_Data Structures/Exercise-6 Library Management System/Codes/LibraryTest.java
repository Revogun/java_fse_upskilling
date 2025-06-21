public class LibraryTest {
    public static void main(String[] args) {
        Library lib = new Library(5);
        lib.addBook(new Book(1, "The Alchemist", "Paulo Coelho"));
        lib.addBook(new Book(2, "Clean Code", "Robert C. Martin"));
        lib.addBook(new Book(3, "1984", "George Orwell"));

        System.out.println("Books in Library:");
        lib.displayBooks();

        System.out.println("\nLinear Search for '1984':");
        Book result = lib.linearSearchByTitle("1984");
        System.out.println(result != null ? result : "Book not found");

        System.out.println("\nSorting books for binary search...");
        lib.sortBooksByTitle();

        System.out.println("\nBinary Search for 'Clean Code':");
        Book result2 = lib.binarySearchByTitle("Clean Code");
        System.out.println(result2 != null ? result2 : "Book not found");
    }
}
