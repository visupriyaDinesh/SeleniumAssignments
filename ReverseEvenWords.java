package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am a software tester";
		String[] strCh= str.split(" ");
		StringBuffer strRes = new StringBuffer();
		for(int i = 0; i < strCh.length; i++)
		{
			if(i%2 != 0)
			{
			for(int j = strCh[i].length()-1;j>=0;j--)
			strRes.append(strCh[i].charAt(j));
			}
			else
			{
				strRes.append(strCh[i]);
			}
			strRes.append(" ");
		}
		System.out.println(strRes);
	}

}
