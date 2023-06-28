import java.util.Random;
import java.util.Scanner;

public class GenCheeseShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		final int MAXCHEESE = 4;

		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];

		double sub = 0;
		double Sharp; 
		double Brie;
		double  Swiss;
		Sharp = 1.25;
		Brie = 10.00;
		Swiss = 40.00;

		System.out.println("We sell " + MAXCHEESE + " kinds of Cheese");
		// Three Special Cheeses

		System.out.println("Dalaran Sharp: $1.25 per pound");
		System.out.println("Stormwind Brie: $10.00 per pound");
		System.out.println("Alterac Swiss: $40.00 per pound");

		if (MAXCHEESE > 0) {
			names [0] = "Dalaran Sharp";
			prices[0] = 1.25; }

		if (MAXCHEESE > 1) {
			names [1] = "Stormwind Brie";
			prices [1] = 10.00;}

		if (MAXCHEESE > 2) {
			names [2]= "Alterac Swiss";
			prices[2] = 40.00;}

		Random ranGen = new Random(100);

		for (int i = 3; i < MAXCHEESE; i++) {
			names[i] = "Cheese Type " + (char)('A' + i);
			prices[i] = ranGen.nextInt(1000)/100.0;
			amounts[i] = 0;
			System.out.println(names[i] + ": $" + prices[i] + " per pound"); }
		System.out.println("Cheese " + 'A' + 10);
		System.out.println("Cheese " + (char)'A' + 10);
		System.out.println("Cheese " + (int)'A' + 10);
		System.out.println("Cheese " + (char)('A' + 10));
		System.out.println("Cheese " + (int)('A' + 10));

		for (int i = 0; i < MAXCHEESE; i ++) {
			System.out.print("Enter the amount for " + names[i] + ": " );
			amounts[i]= input.nextInt();}

		System.out.print("Display the itemized list? (1 for yes) ");
		int item = input.nextInt(); 

		if (item == 1) {
			for (int i = 0; i < MAXCHEESE; i++) {
				System.out.println( amounts[i] + " lbs of " + names[i] + " @ = $" + prices[i] * amounts[i]);
				sub = sub + prices[i] * amounts[i];}
		}

			System.out.println("Sub Total: $" + sub);

			if (sub >= 50.00 && sub < 100) {
				System.out.println("-Discount: $" + 10.00);
				System.out.println("Total    : $" + (sub - 10.00));}

			else if (sub >= 100.00) {
				System.out.println("-Discount: $" + 25.00);
				System.out.println("Total    : $" + (sub + -25.00));}

			else if (sub > 0.0) {
				System.out.println("-Discount: $0.0");
				System.out.println("Total    : $" + sub);}

			else if (sub == 0) {
				System.out.println("Sub Total: $0.0");
				System.out.println("Total : $0.0");

			}
		}
	}
