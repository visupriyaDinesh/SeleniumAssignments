package week2.day1;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		StringBuffer res = new StringBuffer();
		for (int i = str.length()-1; i >=0 ; i--) {
			res.append(str.charAt(i));
		}
		if(res.toString().equals(str))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not a Palindrome");
	}

}


//http://leaftaps.com/opentaps/control/main
//Demosalesmanager/crmsfa