public class WebApp implements Observer {
    public void update(String stockName, double newPrice) {
        System.out.println("WebApp - " + stockName + " price updated to ₹" + newPrice);
    }
}
