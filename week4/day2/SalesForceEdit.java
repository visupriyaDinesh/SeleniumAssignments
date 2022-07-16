package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceEdit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// Login
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		driver.findElement(By.id("Login")).click();

		// Click on AppLauncher and Dashboard
		driver.findElement(By.xpath("//button[contains(@class,'salesforceIdentityAppLauncherHeader')]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Dashboards']/ancestor::li")).click();

		// to search dashboard with name
		driver.findElement(By.xpath("//input[contains(@class,'search-text-field slds-input')]")).sendKeys("Visupriya");
		Thread.sleep(3000);

		// click on edit
		driver.findElement(By.xpath("//table[@role='grid']//td[6]//button")).click();
		driver.findElement(By.xpath("(//a[@role='menuitem'])[2]")).click();

		// To switch to frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(frame);

		// to click on edit dashboard property
		driver.findElement(By.xpath("(//button[@title='Edit Dashboard Properties'])[1]")).click();

		// new description and save
		driver.findElement(By.id("dashboardDescriptionInput")).sendKeys("Salesforce");
		driver.findElement(By.id("submitBtn")).click();
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		driver.switchTo().defaultContent();
		driver.close();
	}

}
