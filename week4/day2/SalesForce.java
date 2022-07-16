package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//Login
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		driver.findElement(By.id("Login")).click();
		
		//clickApplauncher ashBoard
		driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Dashboards']/ancestor::li")).click();
		
		//click on create new salesforce
		driver.findElement(By.className("forceActionLink")).click();
		
		//switch to frame
		WebElement dashboardFrame = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(dashboardFrame);
		
		//enter dashboard name and save
		driver.findElement(By.id("dashboardNameInput")).sendKeys("Salesforce Automation by Visupriya");
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		//driver.close();
	}

}
