package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//To enter training shoes and search 
		WebElement in = driver.findElement(By.id("inputValEnter"));
		in.sendKeys("Training Shoes");
		in.sendKeys(Keys.ENTER);

		//To print the count of shoes
		Thread.sleep(3000);
		WebElement count = driver.findElement(By.className("nnn"));
		System.out.println(count.getText());
		
		//To select sort low to high
		driver.findElement(By.xpath("//span[text()='Sort by:']/parent::div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[3]")).click();
		Thread.sleep(3000);
		
		//check the sorted price
		List<WebElement> priceList = driver.findElements(By.xpath("//span[contains(@class,'lfloat product-price')]"));
		System.out.println(priceList.size());
		boolean sorted = true;
		for(int i=0;i<priceList.size()-1;i++)
		{
			int check = Integer.parseInt(priceList.get(i).getText().substring(4));
			int check2 = Integer.parseInt(priceList.get(i+1).getText().substring(4));
			System.out.println(check);
			if(!(check <= check2))
			{
				sorted = false;
				System.out.println("Not sorted");
				break;
			}
		}
		System.out.println("Sorted status : "+sorted);
		
		//provide price value between 900 - 1500
		WebElement fromVal = driver.findElement(By.name("fromVal"));
		fromVal.clear();
		fromVal.sendKeys("900");
		
		WebElement toVal = driver.findElement(By.name("toVal"));
		toVal.clear();
		toVal.sendKeys("1500");
		
		driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow')]")).click();
		Thread.sleep(3000);
		
		//to select color blue
		driver.findElement(By.xpath("//div[@data-displayname='Color']/div[1]")).click();
		WebElement blue = driver.findElement(By.xpath("//label[@for='Color_s-Blue']"));
		blue.click();
		if(blue.isEnabled())
			System.out.println("Checkbox Blue is Clicked");
		else
			System.out.println("Checkbox Blue is Not Clicked");
		
		//click first shown result and print price and discount from new window
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='product-image wooble']")).click();
		
		Set<String> window = driver.getWindowHandles();
		List<String> listWindow = new ArrayList<String>(window);
		driver.switchTo().window(listWindow.get(1));
		
		String price = driver.findElement(By.className("payBlkBig")).getText();
		String discount = driver.findElement(By.xpath("//span[@class='payBlkBig']//following::span/span")).getText();
		System.out.println("Price = "+price);
		System.out.println("Discount = "+discount+" %");
		
		//screenShot of the page
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/IMG001.png");
		FileUtils.copyFile(source, dest);
		System.out.println("File created");
		
		driver.quit();
	}

}
