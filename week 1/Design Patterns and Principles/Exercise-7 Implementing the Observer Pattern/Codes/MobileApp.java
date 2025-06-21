public class MobileApp implements Observer {
    public void update(String stockName, double newPrice) {
        System.out.println("MobileApp - " + stockName + " price updated to ₹" + newPrice);
    }
}
