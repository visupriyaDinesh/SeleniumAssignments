package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//to open nykaa url
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//click on brands
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		brand.click();
		
		//search Loreal paris
		driver.findElement(By.xpath("//input[@name='search-suggestions-nykaa']")).sendKeys("L'Oreal Paris",Keys.ENTER);
		
		//sort by customer top rated
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='sort-name']/parent::button")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		
		//click on hair shampoo
		driver.findElement(By.id("first-filter")).click();
		driver.findElement(By.xpath("//span[text()='Hair']/ancestor::li")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']/ancestor::li[1]")).click();
		driver.findElement(By.xpath("//input[@id='checkbox_Shampoo_316']/ancestor::li[1]")).click();
		driver.findElement(By.xpath("//span[text()='Concern']/parent::div")).click();
		driver.findElement(By.xpath("//input[@id='checkbox_Color Protection_10764']/parent::div")).click();
		driver.findElement(By.xpath("//div[@class='css-d5z3ro']")).click();
		
		//to handle the shampoo window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		
		//to select the size of the shampoo
		WebElement size = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select sizeSelect = new Select(size);
		sizeSelect.selectByVisibleText("175ml");
		String mrp = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]")).getText();
		
		//add to bag
		driver.findElement(By.xpath("//span[text()='Add to Bag']/parent::button")).click();
		
		//click on cart
		driver.findElement(By.xpath("//span[@class='cart-count']/parent::button")).click();
		
		//switch to cart frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		driver.switchTo().frame(frame);
		
		//to get grand mrp
		String grandMrp = driver.findElement(By.xpath("(//div[@class='value'])[4]")).getText();
		driver.findElement(By.xpath("//div[@class='second-col']/button")).click();
		driver.switchTo().defaultContent();
		
		//click check out as guest
		driver.findElement(By.xpath("//div[text()='Checkout as guest']/following-sibling::button")).click();
		
		//get the grand total after checkout and check the amount mismatch
		String total = driver.findElement(By.xpath("//div[text()='Grand Total']/following-sibling::div/span")).getText();
		if(grandMrp.contains(total))
		{
			System.out.println("Grand total matching");                  
		}
		else
		{
			System.out.println("Grand total mismatching");
		}
		
		//exit the application  
		driver.quit();
	}

}
