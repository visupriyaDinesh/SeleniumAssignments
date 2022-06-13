package week1.day2;

public class EmployeeDetails {

	
	public void printEmployeeName(String name)
	{
		System.out.println("Name : "+name);
	}
	public void printEmployeeId(int id)
	{
		System.out.println("Employee Id : "+id);
	}
	public void printAddress(String address)
	{
		System.out.println("Address : "+address);
	}
	public void printPhoneNumber(long ph) {
		System.out.println("Phone Number : "+ph);
	}
	public void printSalary(double salary)
	{
		System.out.println("Salary : "+salary);
	}
	
	public static void main(String[] args) {
		String employeeName = "Ravi";
		int employeeId = 54862;
		String address = "Tamil Nadu";
		long phoneNumber = 9548765556L;
		double salary = 26254.258;
		EmployeeDetails obj = new EmployeeDetails();
		obj.printEmployeeName(employeeName);
		obj.printEmployeeId(employeeId);
		obj.printPhoneNumber(phoneNumber);
		obj.printAddress(address);
		obj.printSalary(salary);
	}
}
