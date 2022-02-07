import java.util.Scanner;

public class StockPicker {

	public static void main(String[] args) {
		
	int MoneytoInvest= 0;	
	Double StockPrice = (double) 0;
		
System.out.println("Welcome to the Stock Picker App! \n" );


Scanner input = new Scanner(System.in);
 

System.out.println("Enter the Total amount of money your are willing to invest: ");

MoneytoInvest= input.nextInt();


System.out.println("Enter the Stock ticker : ") ;

String StockTicker = input.next();

if (StockTicker.length()>5)
	System.out.println(" Invalid Input Please Try again  " );
else
	
	System.out.println("Please Enter the Price : ");
	
	StockPrice= input.nextDouble();

	
	System.out.println("Enter the P/E Ratio :");
	
	float PriceEarningRatio=input.nextFloat();
	
	System.out.println("\nBelow are your results : \n");
	
	System.out.println("Stock:  "+StockTicker );
	System.out.println("Price:  "+StockPrice );
	System.out.println("P/E Ratio:  "+PriceEarningRatio );
	
	
	int NumberOfShares = (int) (MoneytoInvest / StockPrice);
	

	if (PriceEarningRatio>60)
		System.out.println("Warning: This Company may be overvalued!");
	
		System.out.println("# of shares able to purchase : " + NumberOfShares);

	}

}
