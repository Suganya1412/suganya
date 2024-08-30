package week5.Day2.HomeAssingments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsHomeAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		WebElement userNameField = driver.findElement(By.id("username"));
		userNameField.sendKeys("demosalesmanager");
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suganya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabhu");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("150");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		

	}

}
