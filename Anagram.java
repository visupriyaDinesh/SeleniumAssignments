package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "stop";
		String str2 = "pots";
		boolean check = true;
		if(str1.length() == str2.length())
		{
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i = 0; i<str1.length();i++)
			{
				if(ch1[i]!=ch2[i])
				{
					check = false;
					break;
				}
			}
			if(check)
			{
				System.out.println("String is an Anagram");
			}
			else
			{
				System.out.println("String is not an Anagram");
			}
		}
		else
		{
			System.out.println("String is not an Anagram");
		}
		
	}

}
