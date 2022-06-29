package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class MostDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbbbcccc";
		char[] ch = str.toCharArray();
		Integer count = 0;
		Integer max = 0;
		Character res = null;
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (!m.isEmpty()) {
				if (m.containsKey(ch[i])) {
					if(count < ch.length/2) {
					count = m.get(ch[i]);
					count++;
					}
					else
					{
						break;
					}
					m.put(ch[i], count);
				} else {
					m.put(ch[i], 1);
				}
			} else {
				m.put(ch[i], 1);
			}
			count = 0;
		}
		for (Entry<Character, Integer> e : m.entrySet()) {
			if(max < e.getValue())
			{
				max = e.getValue();
				res = e.getKey();
			}
		}
		System.out.println(res);

	}

}
