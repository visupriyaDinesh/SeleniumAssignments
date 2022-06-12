package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 8;
		int prev = 0;
		int next = 1;
		System.out.println(0);
		int sum = 1;
		for (int i = 0 ; i < size - 2 ; i++)
		{	
			System.out.println(sum);
			sum = prev + next;
			prev = next;
			next = sum;
		}
	}

}
