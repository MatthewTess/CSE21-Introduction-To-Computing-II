import java.util.Random;
import java.util.Scanner;

public class GenCheeseShopv2 {

	public static void intro(String[] names, double[]prices, int[] amounts) {
		// Fill-in
		double Sharp; 
		double Brie;
		double  Swiss;
		Sharp = 1.25;
		Brie = 10.00;
		Swiss = 40.00;
		System.out.println("We sell " + names.length + " kinds of Cheese");


		if (names.length > 0) {
			names [0] = "Dalaran Sharp";
			System.out.println("Dalaran Sharp: $1.25 per pound");
			prices[0] = 1.25; }

		if (names.length > 1) {
			names [1] = "Stormwind Brie";	
			System.out.println("Stormwind Brie: $10.00 per pound");
			prices [1] = 10.00;}

		if (names.length > 2) {
			names [2]= "Alterac Swiss";
			System.out.println("Alterac Swiss: $40.00 per pound");
			prices[2] = 40.00;}

		Random ranGen = new Random(100);

		for (int i = 3; i < names.length; i++) {
			names[i] = "Cheese Type " + (char)('A' + i);
			prices[i] = ranGen.nextInt(1000)/100.0;
			amounts[i] = 0;
			System.out.println(names[i] + ": $" + prices[i] + " per pound");}

	}

	public static void getAmount(Scanner input, String[] names, int[] amounts) {
		// Fill-in
		for(int i = 0; i < names.length; i++) 
		{System.out.print("Enter the amount of "+ names[i] + ": ");
		amounts[i] = input.nextInt();}


	}

	public static void itemizedList(String[] names, double[]prices, int[] amounts) {
		// Fill-in
		for (int i = 0; i < names.length; i++) {
			System.out.println( amounts[i] + " lbs of " + names[i] + " @ = $" + prices[i] * amounts[i]);}
	}


	public static double calcSubTotal(double[] prices, int[] amounts) {

		double total = 0;
		for (int i = 0; i < prices.length; i++) {
			total = total + amounts[i] * prices[i]; }
		return total;

	}


	public static int discount(double subTotal){
		// Fix
		int discount = 0;
		if(subTotal>= 100)
			discount = -25;
		else if(subTotal>= 50)
			discount = -10;
		return discount;
	}

	public static void printTotal(double subTotal, int discount) {
		// Fill-in

		System.out.println("Sub total: $" + subTotal);
		System.out.println("-Discount: $" + discount);
		System.out.println("Total: $" + (subTotal + discount));

	}




	public static void main(String[] args) {

		final int MAXCHEESE = 4;

		// DO NOT CHANGE ANYTHING BELOW
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];

		Scanner input = new Scanner(System.in);

		intro(names, prices, amounts);

		getAmount(input, names, amounts);

		double total = calcSubTotal(prices, amounts);

		if (MAXCHEESE > 0) {
			System.out.print("Display the itemized list? (1 for yes) ");
			int itemized = input.nextInt();

			if (itemized == 1) {
				itemizedList(names, prices, amounts);
			}
		}

		System.out.println();

		printTotal(total, discount(total));
	}
}