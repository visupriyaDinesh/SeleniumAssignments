package week1.day2;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 958661425578l;
	boolean isPunctured = true;
	String bikeName = "Honda Pleasure";
	double runningKM = 10678.254;
	
	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
		int noOfWheels2 = obj.noOfWheels;
		System.out.println("No of wheels : " +noOfWheels2);
		short noOfMirrors2 = obj.noOfMirrors;
		System.out.println("No of Mirrors "+noOfMirrors2);
		long chassisNumber2 = obj.chassisNumber;
		System.out.println("Chassis Number : "+chassisNumber2);
		boolean isPunctured2 = obj.isPunctured;
		System.out.println("Bike is punctured : "+isPunctured2);
		String bikeName2 = obj.bikeName;
		System.out.println("Bike Name : "+bikeName2);
		double runningKM2 = obj.runningKM;
		System.out.println("KM runned : "+runningKM2);
		
	}
}
