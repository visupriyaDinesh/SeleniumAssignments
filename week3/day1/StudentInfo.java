package week3.day1;

public class StudentInfo {
	
	//To print student Id
	public void getStudentInfo(int id)
	{
		System.out.println("Student ID : "+id); 
	}
	
	//To print student Id and Name
	public void getStudentInfo(int id,String name) {
		System.out.println("Student ID : "+id);
		System.out.println("Student Name : "+name);
	}
	
	//To print Email and Phone
	public void getStudentInfo(String email,long phone) {
		System.out.println("Email ID : "+ email);
		System.out.println("Phone Number : "+phone);
	}
}
