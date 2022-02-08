package assignment1;

import  java.util.*;

public class Problem4 {
	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array input list : ");
		int arraySize = scan.nextInt();
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Enter the elements to store into array input list : ");
			input.add(scan.next());
		}		
		questionFour(input, arraySize);
		scan.close();
	}	
	public static void questionFour(ArrayList<String> A1, int size) {
		ArrayList<String> output = new ArrayList<String>();
		int [] arr = new int [size];
		for (int i = 0; i < size; i++) {
			arr[i] = A1.get(i).length();
		}			
		Arrays.sort(arr);		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (arr[i] == A1.get(j).length()) {
					output.add(A1.get(j));
					A1.set(j, "");
				}
			}
		}		
		System.out.println(output);	
	}
}
