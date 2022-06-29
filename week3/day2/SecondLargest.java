package week3.day2;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> li = new TreeSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		li.add(3);
		li.add(2);
		li.add(11);
		li.add(4);
		li.add(6);
		li.add(7);
		list.addAll(li);
		System.out.println(list);
		System.out.println("Second Largest Number : "+list.get(list.size()-2));
	}

}
