package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		
		WebElement leadsLink = driver.findElement(By.linkText("Leads"));
		leadsLink.click();
		
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		
		
		//To create Lead
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Cognizant");
		
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Geetha");
		
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Priya");
		
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("geethu");
		
		WebElement departmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		departmentName.sendKeys("software Testing");
		
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Experienced Professional");
		
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("geethapriya19@gmail.com");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stat = new Select(state);
		stat.selectByVisibleText("Texas");
		
		WebElement submit = driver.findElement(By.className("smallSubmit"));
		submit.click();
		driver.getTitle();
		System.out.println(driver.getTitle());
	
		//Assignment 2 - To edit lead
		WebElement editLink = driver.findElement(By.linkText("Edit"));
		editLink.click();
		
		WebElement clearDescription = driver.findElement(By.id("updateLeadForm_description"));
		clearDescription.clear();
		
		WebElement impNote = driver.findElement(By.id("updateLeadForm_importantNote"));
		impNote.sendKeys("Description is deleted");
		
		WebElement update = driver.findElement(By.className("smallSubmit"));
		update.click();
		
		System.out.println(driver.getTitle());
	}

}
