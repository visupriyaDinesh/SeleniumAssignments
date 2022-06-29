package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li1 = new ArrayList<Integer>();
		//{3,2,11,4,6,7}
		li1.add(3);
		li1.add(2);
		li1.add(11);
		li1.add(4);
		li1.add(6);
		li1.add(7);
		List<Integer> li2 = new ArrayList<Integer>();
		//{1,2,8,4,9,7}
		li2.add(1);
		li2.add(2);
		li2.add(8);
		li2.add(4);
		li2.add(4);
		li2.add(9);
		li2.add(7);
		for (int i = 0; i<li1.size();i++) {
			if(!li2.contains(li1.get(i)))
			{
				li1.remove(i);
			}
		}
		System.out.println(li1);
	}

}
