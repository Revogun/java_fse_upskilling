public class Forecast {
    public static double futureValue(int years, double initialAmount, double growthRate) {
        if (years == 0) {
            return initialAmount;
        }
        return futureValue(years - 1, initialAmount, growthRate) * (1 + growthRate);
    }

    public static double futureValueMemo(int years, double initialAmount, double growthRate, double[] memo) {
        if (years == 0) return initialAmount;
        if (memo[years] != 0.0) return memo[years];

        memo[years] = futureValueMemo(years - 1, initialAmount, growthRate, memo) * (1 + growthRate);
        return memo[years];
    }
}
