import java.util.Scanner;

public class ChesseShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double Sharp; 
		double Brie;
		double  Swiss;
		Sharp = 1.25;
		Brie = 10.00;
		Swiss = 40.00;

		System.out.println("We sell three kinds of Cheese");
		System.out.println("Dalaran Sharp: $1.25 per pound");
		System.out.println("Stormwind Brie: $10.00 per pound");
		System.out.println("Alterac Swiss: $40.00 per pound");
		System.out.print("Enter the amount of Sharp in lbs: " );
		Sharp = input.nextDouble();

		System.out.print("Enter the amount of Brie in lbs: ");
		Brie = input.nextDouble();

		System.out.print("Enter the amount of Swiss in lbs: ");
		Swiss = input.nextDouble();


		System.out.print("Display the itemized list? (1 for yes) ");
		int item = input.nextInt();

		if (item == 1 && Sharp > 0) { 
			System.out.println((int) Sharp + " lbs " + "of Sharp @ = $" + Sharp * 1.25); }

		if (item == 1 && Brie > 0) {
			System.out.println((int) Brie + " lbs " + "of Brie @ = $" + Brie * 10.00);}

		if (item == 1 && Swiss > 0) {
			System.out.println((int) Swiss + " lbs " + "of Swiss @ = $" + Swiss * 40.00);}
		double sub = Sharp * 1.25 + Brie * 10.00 + Swiss * 40.00;

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
