package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String check = "Absolute Usage";
		String check = "Market Share";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		
		//Table 1
		WebElement table = driver.findElement(By.xpath("//div[@class = 'render']/table"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (int i = 1; i < row.size(); i++) {
			WebElement each = row.get(i);
			List<WebElement> col = each.findElements(By.tagName("td"));
			if(col.get(0).getText().equals(check))
			{
				System.out.println("jQuery : "+col.get(1).getText());
				System.out.println("Bootstrap : "+col.get(2).getText());
				System.out.println("Modernizr : "+col.get(3).getText());
			}
		}
		driver.close();
		
	}

}
