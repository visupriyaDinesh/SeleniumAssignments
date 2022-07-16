package week4.day1;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//navigate to web page
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click stock market
		driver.findElement(By.id("navbtn_stockmarket")).click();
		//click NSE bulk deal
		driver.findElement(By.linkText("NSE Bulk Deals")).click();
		Set<String> check = new LinkedHashSet<String>();
		//identify table
		WebElement table = driver.findElement(By.xpath("//div[@class='table-responsive']/table"));
		//table row
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (int i = 1; i < row.size(); i++) {
			WebElement eachRow = row.get(i);
			//table column
			List<WebElement> col = eachRow.findElements(By.tagName("td"));
			//check duplicate security name
			if (!check.add(col.get(3).getText())) {
				System.out.println("Duplicate Security Name: " + col.get(3).getText());
			}
		}
		System.out.println("Security Name");
		System.out.println(check);
		driver.close();
	}

}
