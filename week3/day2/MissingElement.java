package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(7);
		li.add(6);
		li.add(8);
		Collections.sort(li);
		for(int i = 1; i <= li.get(li.size()-1);i++)
		{
			if (!li.contains(i))
			{
				System.out.println("Missing Number : "+ i);
			}
		}
		
	}

}
