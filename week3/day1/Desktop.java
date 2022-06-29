package week3.day1;

public class Desktop extends Computer{

	public void desktopSize()
	{
		computerModel();
		System.out.println("The size of desktop is 10 X 10" );
	}
	
	
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopSize();
	}

}
