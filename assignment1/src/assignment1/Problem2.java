package assignment1;

import java.util.*;

public class Problem2 {
 
	public static void problem2()
	{
		LinkedList<Integer> input = new LinkedList<Integer>();
		LinkedList<ArrayList<Integer>> output = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of list :");
		int n = sc.nextInt();
		System.out.println("Enter k value :");
		int k=sc.nextInt();
		System.out.println("Enter the list of elememts :");
		for(int i=0;i<n;i++)
		{  
			input.add(sc.nextInt());
		}
		
		for(int i=0;i<n-1;i++)
		{
			ArrayList<Integer> pair=new ArrayList<>();
			int ele = (input.get(i) + input.get(i+1));
			if(k==ele)
			{
				pair.add(input.get(i));
				pair.add(input.get(i+1));
				output.add(pair);
			}
		}
		System.out.println("Output : "+output);
		sc.close();
	}
	public static void main(String args[]) {
		problem2();
	}
}