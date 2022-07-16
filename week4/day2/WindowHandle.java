package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://www.leafground.com/pages/Window.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	driver.findElement(By.id("home")).click();
	Set<String> windowHandles1 = driver.getWindowHandles();
	List<String> window1 = new ArrayList<String>(windowHandles1);
	driver.switchTo().window(window1.get(1));
	driver.close();
	
	driver.switchTo().window(window1.get(0));
	driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
	Set<String> window2 = driver.getWindowHandles();
	System.out.println(window2);
	driver.quit();
}
}
