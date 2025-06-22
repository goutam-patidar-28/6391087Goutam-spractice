public class Forecast {

    // Recursively calculates future value with annual growth
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }

        double updatedValue = currentValue * (1 + growthRate);
        return predictFutureValue(updatedValue, growthRate, years - 1);
    }
}
