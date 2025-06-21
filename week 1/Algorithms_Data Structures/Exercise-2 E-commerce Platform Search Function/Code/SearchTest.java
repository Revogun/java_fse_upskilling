public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "iPhone", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Laptop", "Electronics"),
            new Product(4, "Watch", "Accessories")
        };

        String searchTerm = "Laptop";

        Product resultLinear = LinearSearch.linearSearch(products, searchTerm);
        System.out.println("Linear Search Result: " + (resultLinear != null ? resultLinear : "Not Found"));

        Product resultBinary = BinarySearch.binarySearch(products, searchTerm);
        System.out.println("Binary Search Result: " + (resultBinary != null ? resultBinary : "Not Found"));
    }
}
