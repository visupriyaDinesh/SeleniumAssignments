package week4.day2; 

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//enter the source destination and date to search bus
		driver.findElement(By.id("src")).sendKeys("Madiwala Bangalore");
		driver.findElement(By.id("dest")).sendKeys("Koyambedu Chennai");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[text()='21']")).click();
		// to check the auto select option is available or not
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.xpath("//ul[contains(@class,'autoFill')]"));
		if(findElement.isDisplayed()) {
			findElement.click();
		}
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		//to select the bus preferences
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='dtAfter 6 pm']/parent::li")).click();
		driver.findElement(By.xpath("//input[@id='bt_SLEEPER']/parent::li")).click();
		driver.findElement(By.xpath("(//div[@class='bannerShort'])[1]/parent::li")).click();
		
		//details of bus name and price and sorting
		List<WebElement> busName = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));	
		List<WebElement> busPrice = driver.findElements(By.xpath("//div[contains(@class,'fare')]/span"));
		Map<String, Integer> result = new TreeMap<String, Integer>();
		for (int i = 0; i < busName.size(); i++) {
			result.put(busName.get(i).getText(),Integer.parseInt(busPrice.get(i).getText()));
		}
		
		System.out.println(result);
		driver.close();
	
	}
}
		