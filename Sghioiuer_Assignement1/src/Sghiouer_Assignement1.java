import java.util.Scanner;

public class Sghiouer_Assignement1 {

	public static void main(String[] args) {

		Double MoneytoInvest = (double) 0;
		Double StockPrice = (double) 0;

		System.out.println("Welcome to the Stock Picker App! \n");

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Total amount of money your are willing to invest: ");

		MoneytoInvest = (double) input.nextDouble();

		System.out.println("Enter the Stock ticker : ");

		String StockTicker = input.next();

		while (StockTicker.length() > 5) {
			System.out.println(" Invalid Input Please Try again  ");
			StockTicker = input.next();

		}

		System.out.println("Please Enter the Price : ");

		StockPrice = input.nextDouble();

		while (StockPrice < 0.01) {
			System.out.println(" Invalid Input Please Try again \n");
			StockPrice = input.nextDouble();
		}

		System.out.println("Enter the P/E Ratio :");

		float PriceEarningRatio = input.nextFloat();

		System.out.println("\nBelow are your results : \n");

		System.out.println("Stock:  " + StockTicker);
		System.out.println("Price:  " + "$" + StockPrice);
		System.out.println("P/E Ratio:  " + PriceEarningRatio);

		int NumberOfShares = (int) (MoneytoInvest / StockPrice);

		if (PriceEarningRatio > 60)
			System.out.println("Warning: This Company may be overvalued!");

		System.out.println("# of shares able to purchase : " + NumberOfShares);

	}

}
