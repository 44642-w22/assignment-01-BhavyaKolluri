package assignment1;

import java.util.*;

public class Problem6 {
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the even size of stack: ");
		int size = scan.nextInt();
		while(true) {
			if (size % 2 == 0) {
				break;
			}
			else {
				System.out.println("Sorry, you entered odd number. Enter even size again: ");
				size = scan.nextInt();
			}
		}		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements to store into the stack: ");
			stack.push(scan.nextInt());
		}		
		questionSix(stack,size);
		scan.close();
	}	
	public static void questionSix(Stack<Integer> stack, int size) {
		ArrayList<Integer> output = new ArrayList<>();
		int p = size / 2;
		for (int i = 0; i < size; i++) {
			if(i < p) {
				output.add(stack.pop());
			}
			else {
				output.add(stack.get(i-p));
			}
		}
		System.out.println(output);
	}
}