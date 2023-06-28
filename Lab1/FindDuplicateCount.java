
public class FindDuplicateCount {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};
		
		for (int i = 0 ; i < arr.length ; i++) {
			int num = arr[i];
			int count = 0;
			for(int n = i + 1; n < arr.length; n++ ) {
				if (arr[n] == num) {
					count++;
				}
			}
			if(count == 0) {
				System.out.println("No duplicates with value " + num + " beyond Index " + i);
			}else {
				System.out.println("There are " + count + " more occurrences of value" + num + " starting at index " + i);
			}
		}
	}

}
