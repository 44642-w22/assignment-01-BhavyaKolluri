package assignment1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Problem10 
{
	public static void main(String[] args) 
	{		
		Deque<String> deq = new ArrayDeque<>();
		List<Integer> lis = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Deque :");
		int length = scan.nextInt();		
		System.out.println("Enter Characters into Deque :");
		for(int i=1; i<=length;i++) 
		{
			deq.add(scan.next());
		}		
		System.out.println("Enter the length of Array :");
		int len_array = scan.nextInt();		
		System.out.println("Enter the Array values in 1 and 0 :");
		for(int i=1; i<=len_array;i++) 
		{
			lis.add(scan.nextInt());
		}			
		Deque<String> D_dup = new LinkedList<>(deq);
		Stack<String> S = new Stack<>();		
		for(int e : lis) {
			switch(e) {
			 	case 1: if(!D_dup.isEmpty()) 
			 	{
			 		S.add(D_dup.pollFirst());
			 		break;
			 	}
			 	case 0: if(!S.isEmpty()) 
			 	{
			 		D_dup.addFirst(S.pop());
			 		break;
			 	}
			}
		}		
		Iterator<String> objIterator = D_dup.iterator();  
		while(objIterator.hasNext())
		{
			System.out.print("Output:" + objIterator.next());
		}
		scan.close();
	}	
}