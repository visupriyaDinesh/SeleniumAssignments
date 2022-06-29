package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We We learn java basics as part of java sessions in java week1";
		List<String> li = new ArrayList<String>();
		String[] str = text.split(" ");
		for (String s : str) {
			if(!li.contains(s))
				li.add(s);
			else
				li.add("");
		}
		System.out.println(li);
	}

}
