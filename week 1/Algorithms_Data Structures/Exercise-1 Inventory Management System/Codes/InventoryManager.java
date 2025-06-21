import java.util.HashMap;

public class InventoryManager {
    HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.productId, product);
    }

    public void updateProduct(int productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.quantity = quantity;
            product.price = price;
        }
    }

    public void deleteProduct(int productId) {
        inventory.remove(productId);
    }

    public void displayInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
