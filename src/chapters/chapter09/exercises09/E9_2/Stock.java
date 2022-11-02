package chapters.chapter09.exercises09.E9_2;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;


    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    public double getChangePercent() {
        double changeAmount = currentPrice - previousClosingPrice;
        return ( changeAmount / previousClosingPrice) *100;
    }

}
