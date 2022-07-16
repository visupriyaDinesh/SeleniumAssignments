package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Link;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.xpath("//a[text()='Merge Contacts']/parent::li")).click();
		
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(window.get(1));
		
		driver.findElement(By.xpath("//a[@class='linktext'][1]")).click();
		
		driver.switchTo().window(window.get(0));
		
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> window2 = new ArrayList<String>(windowHandles2);
		System.out.println(window2);
		driver.switchTo().window(window2.get(1));
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		
		driver.switchTo().window(window2.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		Alert yes = driver.switchTo().alert();
		yes.accept();
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
