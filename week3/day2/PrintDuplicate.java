package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Print the duplicate numbers in the list
		list -> [1,12,22,1,34,12,56,22,78]
		1,12,22
		 */
		
		Set<Integer> s = new HashSet<Integer>();
		if(!s.add(1))
		{
			System.out.println("1 is duplicate");
		}
		if(!s.add(12))
		{
			System.out.println("12 is duplicate");
		}		
		if(!s.add(22))
		{
			System.out.println("22 is duplicate");
		}		
		if(!s.add(1))
		{
			System.out.println("1 is duplicate");
		}		
		if(!s.add(34))
		{
			System.out.println("34 is duplicate");
		}		
		if(!s.add(12))
		{
			System.out.println("12 is duplicate");
		}		
		if(!s.add(56))
		{
			System.out.println("56 is duplicate");
		}		
		if(!s.add(22))
		{
			System.out.println("22 is duplicate");
		}		
		if(!s.add(78))
		{
			System.out.println("78 is duplicate");
		}		
	}

}
