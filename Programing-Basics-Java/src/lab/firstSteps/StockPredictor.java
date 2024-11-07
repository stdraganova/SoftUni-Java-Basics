import java.util.Random;

public class StockPredictor {
    public static void main(String[] args) {
        // Generate sample stock prices
        double[] prices = generateStockPrices(30);

        // Calculate average price
        double averagePrice = calculateAveragePrice(prices);

        // Calculate standard deviation
        double standardDeviation = calculateStandardDeviation(prices, averagePrice);

        // Determine buy/sell recommendations
        double currentPrice = prices[prices.length - 1];
        double upperThreshold = averagePrice + standardDeviation;
        double lowerThreshold = averagePrice - standardDeviation;

        if (currentPrice > upperThreshold) {
            System.out.println("Sell the stock. The price is above the upper threshold.");
        } else if (currentPrice < lowerThreshold) {
            System.out.println("Buy the stock. The price is below the lower threshold.");
        } else {
            System.out.println("Hold the stock. The price is within the acceptable range.");
        }
    }

    // Generate random stock prices
    public static double[] generateStockPrices(int numPrices) {
        double[] prices = new double[numPrices];
        Random random = new Random();

        for (int i = 0; i < numPrices; i++) {
            prices[i] = random.nextDouble() * 100; // Random price between 0 and 100
        }

        return prices;
    }

    // Calculate average price
    public static double calculateAveragePrice(double[] prices) {
        double sum = 0;

        for (double price : prices) {
            sum += price;
        }

        return sum / prices.length;
    }

    // Calculate standard deviation
    public static double calculateStandardDeviation(double[] prices, double averagePrice) {
        double sum = 0;

        for (double price : prices) {
            sum += Math.pow(price - averagePrice, 2);
        }

        double variance = sum / prices.length;

        return Math.sqrt(variance);
    }
}