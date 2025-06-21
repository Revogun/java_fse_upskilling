public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.registerObserver(mobile);
        market.registerObserver(web);

        market.setStockData("TCS", 3750.50);
        market.setStockData("Infosys", 1450.00);
    }
}
