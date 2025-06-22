public class Main {
    public static void main(String[] args) {
        double currentValue = 1000.0;      
        double growthRate = 0.10;       
        int years = 5;                      

        double predictedValue = Forecast.predictFutureValue(currentValue, growthRate, years);

        System.out.println("Predicted future value after " + years + " years: Rs. " + predictedValue);
    }
}
