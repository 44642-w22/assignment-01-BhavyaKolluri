package assignment1;

import java.util.*;

public class Problem5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input brackets :");  
		String input = scan.nextLine();
		questionFive(input);
		scan.close();
	}
	private static void questionFive(String strInput) {
		boolean value = true;
		ArrayList<Character> input = new ArrayList<>();
		input.add('(');
		input.add('[');
		input.add('{');
		Stack<Character> inputStack = new Stack<>(); 
		for (int i = 0; i < strInput.length(); i++) {
			if (input.contains(strInput.charAt(i))) {
				inputStack.push(strInput.charAt(i));
			} else {
				char peekEle;
				if (inputStack.size() > 0) {
					peekEle = inputStack.peek();
				} else {
					value = false;
					break;
				}
				if (inputStack.size() > 0 && (peekEle == '{' && strInput.charAt(i) == '}'
						|| peekEle == '(' && strInput.charAt(i) == ')'
						|| peekEle == '[' && strInput.charAt(i) == ']')) {
					inputStack.pop();
				} else {
					value = false;
					break;
				}
			}
		}
		if (value && inputStack.isEmpty())
			System.out.println(true);
		else
			System.out.println(false);
	}
}
