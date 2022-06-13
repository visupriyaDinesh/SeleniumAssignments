package week1.day2;

public class Car {
	
	public static void main(String[] args) {
		Car obj = new Car();
		System.out.print("If you need to move the car ");
		obj.applyAcclerator();
		System.out.print("If you need to increase the speed ");
		obj.applyGear();
		System.out.print("If you need to stop the car ");
		obj.applyBreak();
		System.out.print("If it rains ");
		obj.onWiper();	
	}
	
	void applyBreak()
	{
		System.out.println("Break is Applied");
	}
	
	private void applyGear()
	{
		System.out.println("Gear is Applied");
	}
	
	void applyAcclerator()
	{
		System.out.println("Accerator is Applied");
	}
	
	public void onWiper()
	{
		System.out.println("Turn on Wiper");
	}
	

}
