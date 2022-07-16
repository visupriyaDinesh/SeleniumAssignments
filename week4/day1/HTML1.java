package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		
		//Table 1
		WebElement table = driver.findElement(By.xpath("//div[@class = 'render']/table"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		WebElement each = row.get(1);
		List<WebElement> col = each.findElements(By.tagName("td"));
		System.out.println("Table 1");
		System.out.println("Row Count "+row.size());
		System.out.println("Column Count "+col.size());
		System.out.println("----------------------------------------------");
		
		//Table 2
		WebElement table2 = driver.findElement(By.xpath("//table[@class='attributes-list']"));
		List<WebElement> row2 = table2.findElements(By.tagName("tr"));
		WebElement eachrow = row2.get(1);
		List<WebElement> col2 = eachrow.findElements(By.tagName("td"));
		System.out.println("Table 2");
		System.out.println("Row Count "+row2.size());
		System.out.println("Column Count "+col2.size());
		
		driver.close();
	}

}
