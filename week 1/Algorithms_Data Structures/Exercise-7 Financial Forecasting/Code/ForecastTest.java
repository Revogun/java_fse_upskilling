public class ForecastTest {
    public static void main(String[] args) {
        int years = 5;
        double initialAmount = 10000;
        double growthRate = 0.10;

        double forecast = Forecast.futureValue(years, initialAmount, growthRate);
        System.out.printf("Recursive Forecast Value after %d years: ₹%.2f%n", years, forecast);

        double[] memo = new double[years + 1];
        double optimizedForecast = Forecast.futureValueMemo(years, initialAmount, growthRate, memo);
        System.out.printf("Optimized Forecast Value (Memoized) after %d years: ₹%.2f%n", years, optimizedForecast);
    }
}
