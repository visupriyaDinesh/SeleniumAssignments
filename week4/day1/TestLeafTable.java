package week4.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		
		//To get the Third row second column progress value
		WebElement eachrow = row.get(3);
		List<WebElement> col = eachrow.findElements(By.tagName("td"));
		System.out.println("The progress value of 'Learn to interact with Elements' : "+ col.get(1).getText());
		
		//To click the check box for least progress value
		WebElement eachrow1 = row.get(5);
		List<WebElement> col1 = eachrow1.findElements(By.tagName("td"));
		WebElement check = col1.get(2);
		check.findElement(By.name("vital")).click();
		System.out.println("Row Count "+row.size());
		System.out.println("Column Count "+col.size());
		driver.close();
	}

}
