public class InventoryTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        manager.addProduct(new Product(1, "Monitor", 10, 7500));
        manager.addProduct(new Product(2, "Keyboard", 20, 1500));

        manager.displayInventory();

        manager.updateProduct(2, 25, 1400);
        manager.deleteProduct(1);

        manager.displayInventory();
    }
}
