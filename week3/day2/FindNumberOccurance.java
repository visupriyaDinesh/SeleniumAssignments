package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class FindNumberOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		List<Integer> num = new ArrayList<Integer>();
		int count = 0;
		num.add(2);
		num.add(3);
		num.add(5);
		num.add(6);
		num.add(3);
		num.add(2);
		num.add(1);
		num.add(4);
		num.add(2);
		num.add(1);
		num.add(6);
		num.add(-1);
		Map<Integer, Integer> m = new HashedMap<Integer, Integer>();
		for (int i = 0; i < num.size(); i++) {
			if (!m.containsKey(num.get(i))) {
				for (int j = i + 1; j < num.size(); j++) {
					if (num.get(i) == num.get(j)) {
						count++;
					}
				}
				m.put(num.get(i), count+1);
				count = 0;
			}
		}
		System.out.println(m);
	}

}
