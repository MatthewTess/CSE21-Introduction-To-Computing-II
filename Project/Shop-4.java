

import java.util.Scanner;
public class Shop {

	static double amountOff = 0;
	static double discountAmount = 0;
	public static double Setup(Scanner input, String[]names, double[]prices) {

		System.out.print(" Enter the number of items: ") ; 
		int item = input.nextInt();	

		for (int i=0; i < item; i++) { 
			System.out.print("Enter name of product " + i + ":");
			names[i] = input.next(); 
			System.out.print("Enter price of product " + i + ":");
			prices[i] = input.nextDouble();	
			
		
		}	
		
		System.out.print("Enter the amount to qualify for discount: ");
		discountAmount = input.nextDouble(); 
		System.out.print("Enter the discount rate (0.1 for 10 %): ");
		amountOff = input.nextDouble();	
		return item;
	} 
	public static void Buy(Scanner input, String[] names, double[] prices, int[] amounts, double items) {

		for (int i = 0; i < items; i++){
			System.out.print("Enter the amount of " + names[i] + ": " );
			amounts[i] = input.nextInt();
		}
	}
	public static void List(double[] prices, int[] amounts, String [] names, double items) {

		for(int i = 0; i < items; i++) {
			if (amounts[i] > 0) {

				System.out.println(amounts[i] + " count of " + names[i] + " @  $" + prices[i] + " = $" + (amounts[i]*prices[i]));
			}
		}
	}
	public static void Checkout(int[] amounts, double[] prices) {

		double total = 0;

		for(int i = 0; i < amounts.length; i++) {
			total = prices[i] * amounts[i] + total;
		}
		double discount = 0;
		discount = (total * (amountOff));
		if (total >= discountAmount) {
			System.out.println();
			System.out.println("Thank you for coming! ");
			System.out.println("Sub Total: $" + total);
			System.out.println("-Discount: $" + (discount));
			System.out.println("Total    : $" + (total - (discount)));
		}
		else if (total < discountAmount) {
			System.out.println();
			System.out.println("Thanks for coming! ");
			System.out.println("Sub Total: $" + total);
			System.out.println("-Discount: $" + " 0.0");
			System.out.println("Total    :$ " + total);
		}
	}

	public static void main(String[] args) {

		final int MAX = 1000;
		int establish = 0;
		int purchase = 0;
		double item = 0;

		String[] names = new String[MAX];
		double[] prices = new double[MAX];
		int[] amounts = new int[MAX];
		do{
			Scanner input = new Scanner(System.in);
			System.out.println("This program supports 4 functions: ");
			System.out.println("1.Setup shop");
			System.out.println("2.Buy");
			System.out.println("3.List items");
			System.out.println("4.Checkout");
			System.out.print("Choose the function you want: ");

			int func = input.nextInt();
			if ( 1 <= func || func >= 4) {			
				if (func == 1) {
					if (establish == 0) {
						System.out.println();
						item = Setup (input, names, prices);	
						System.out.println();
					}
					establish = 1;
				}
				if (func == 2) {
					if (establish == 1) {
						System.out.println();
						Buy(input, names, prices, amounts, item);
						System.out.println();
					}
					else{ 
						System.out.print("Shop is not setup! "); 
					}
					purchase = 1;
				}
				if (func == 3) {
					if (purchase == 1) {
						System.out.println();
						List(prices, amounts, names, item);	
						System.out.println();
					}		
					if (establish == 1 && purchase == 0) {
						System.out.println();
						System.out.println("Try again: You have not bought anything ");
						System.out.println();
					}	
					if (establish == 0) {
						System.out.println();
						System.out.println("Shop is not setup! ");
						System.out.println();

					}
				}
				if (func == 4) {
					if (establish == 0) {
						System.out.println();
						System.out.println("Shop is not setup! ");
						System.out.println();
						continue;
					}
					if (purchase == 0) {		
						System.out.println("Try again: You have not bought anything ");
						continue;
					}
					if (purchase == 1) {
						System.out.println();
						Checkout(amounts, prices);
						System.out.println();
						break;
					} 	
				}
				else if (func > 4) {	
					System.out.println();
					System.out.println("Error: Do not know " + func);	
					System.out.println();

				}	
			}
		}
		while(true);
	}
}