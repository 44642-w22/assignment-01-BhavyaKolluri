package assignment1;

import java.util.*;

public class Problem3 {
	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of input array : ");
		int arraySize = scan.nextInt();
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter the array elements : ");
			input.add(scan.nextInt());
		}		
		questionThree(input);
		scan.close();
	}	
	public static void questionThree(ArrayList<Integer> A1) {
		if(A1.size() == 0) {
			System.out.println(Integer.MIN_VALUE);
		}
		else {
			Collections.sort(A1);
			System.out.println(A1.get(A1.size()-1));
		}
	}
}
