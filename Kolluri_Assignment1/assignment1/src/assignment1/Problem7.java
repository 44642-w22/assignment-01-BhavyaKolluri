package assignment1;

import java.util.*;

public class Problem7 
{
	public static void main(String[] args) 
	{
		Queue<Integer> input = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Queue: ");
		int size = scan.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the elements : ");
			input.add(scan.nextInt());
		}
		questionSeven(input,size);
		scan.close();
	}	
	public static void questionSeven(Queue<Integer> input, int size) 
	{
		int sum = 0;
		for (int i = 0; i < size; i++) 
		{
			sum = sum + input.poll()*(int)(Math.pow(2, i));
		}
		System.out.println(sum);
	}
}