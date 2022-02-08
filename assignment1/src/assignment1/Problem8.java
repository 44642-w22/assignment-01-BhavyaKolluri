package assignment1;

import java.util.*;

public class Problem8 
{
	public static void main(String[] args) 
	{
		Queue<Integer> input = new LinkedList<>();		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Queue : ");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) 
		{
			System.out.println("Enter the elements to Queue : ");
			input.add(scan.nextInt());
		}	
		questionEight (input,n);
		scan.close();		
	}	
	public static void questionEight(Queue<Integer> Q1, int size) 
	{
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> output = new ArrayList<>();
		for (Integer item: Q1) {
            arr.add(item);
        }		
		for(int i = 0; i < size/2; i++) 
		{
			output.add(arr.get(size-i-1));
			output.add(arr.get(i));
		}
		if (size % 2 != 0) 
		{
			output.add(arr.get(size/2));
		}		
		System.out.println(output);
	}	
}