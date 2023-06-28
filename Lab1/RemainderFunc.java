import java.util.Scanner;

public class RemainderFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");
		int max = input.nextInt();

		System.out.print("Please enter the divisor:");
		int divisor = input.nextInt();

		int count = 0;
		
		int[]arr = new int [max + 1];
		
		
		int[] n = new int[max];
		for (int i = 0; i <= max; i++) {
			arr[i] = i ;
		
		System.out.println("num: " + arr[i] + " % "  + divisor + " = " + (arr[i]%divisor));
		} 
	}

}
