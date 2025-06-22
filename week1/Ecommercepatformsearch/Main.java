public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Bag", "Accessories"),
            new Product(105, "Watch", "Accessories")
        };

        System.out.println("--- Linear Search ---");
        Product result1 = SearchAlgorithms.linearSearch(products, "Phone");
        if (result1 != null) {
            System.out.println("Found: " + result1);
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\n--- Binary Search ---");
        SearchAlgorithms.sortProducts(products);
        Product result2 = SearchAlgorithms.binarySearch(products, "Phone");
        if (result2 != null) {
            System.out.println("Found: " + result2);
        } else {
            System.out.println("Product not found.");
        }
    }
}
