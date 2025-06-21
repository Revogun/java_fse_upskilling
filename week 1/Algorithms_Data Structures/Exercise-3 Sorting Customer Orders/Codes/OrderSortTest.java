public class OrderSortTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 2000),
            new Order(102, "Bob", 5000),
            new Order(103, "Charlie", 3000)
        };

        BubbleSort.sort(orders);
        System.out.println("Sorted by Bubble Sort:");
        for (Order o : orders) System.out.println(o);

        Order[] orders2 = {
            new Order(101, "Alice", 2000),
            new Order(102, "Bob", 5000),
            new Order(103, "Charlie", 3000)
        };

        QuickSort.sort(orders2, 0, orders2.length - 1);
        System.out.println("Sorted by Quick Sort:");
        for (Order o : orders2) System.out.println(o);
    }
}
