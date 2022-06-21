package objectAndClass;

public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
		super();
		this.symbol = symbol;
		this.name = name;
		this.previousClosingPrice = previousClosingPrice;
		this.currentPrice = currentPrice;
	}

	public double getChangePercent() {
		return Math.abs(this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice * 100.0;
	}

	public static void main(String[] args) {
		Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);

		System.out.println("The Price -change percentage: " + stock.getChangePercent()+"%");
	}
}
