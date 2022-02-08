package assignment1;

import java.util.LinkedList;
import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> input = new LinkedList<>();
		System.out.println("Enter the size of Linked List :");
		int arraySize = scan.nextInt();
		while(arraySize>0) { 
			System.out.println("Enter the elements to the list : ");
	        input.add(scan.nextInt());
	        arraySize--;  
	        }
	        scan.close();
	    questionOne(input);
	}
	public static void questionOne(LinkedList<Integer> L1) {
    	LinkedList<Integer> output = new LinkedList<>();
    	for (int i = 0; i < L1.size(); i++) {
    		int element = L1.get(i);
    		int sum = 0;
    		for (int j=1; j<=element/2; j++) {
    			if (element%j == 0) {
    				sum += j;
    			}
    		}
    		if (sum == element) {
    			output.add(element);
    		}
    	}
    	System.out.println(output);
    }
}
