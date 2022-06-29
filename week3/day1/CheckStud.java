package week3.day1;

public class CheckStud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo studInfo = new StudentInfo();
		studInfo.getStudentInfo(575523);
		studInfo.getStudentInfo(345670, "Priya");
		studInfo.getStudentInfo("priya@gmail.com", 9876543210L);
	}

}
