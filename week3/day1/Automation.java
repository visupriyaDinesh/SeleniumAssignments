package week3.day1;

public class Automation extends MultipleLanguage implements TestTool,Language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation auto = new Automation();
		auto.java();
		auto.python();
		auto.selenium();
		auto.ruby();
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Inside Java");
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Inside Selenium");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Inside ruby");
	}

}
