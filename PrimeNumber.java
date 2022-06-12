package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 12;
		int count =0;
		for(int i = 2 ; i< input ; i++)
		{
			if(input % i == 0)
			{
				System.out.println(input + " is not a prime Number");
				count ++;
				break;
			}
		}
		if (count ==0 || input == 1)
		{
			System.out.println(input + " is a prime number");
		}
	}

}
