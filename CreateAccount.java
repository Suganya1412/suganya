package week5.Day2.HomeAssingments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("demosalesmanager");
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys("Suganya");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.name("numberEmployees")).sendKeys("100");
		driver.findElement(By.xpath("//input[@id=\"officeSiteName\"]")).sendKeys("LeafTaps");
		driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
		driver.close();
		
		
		
		
		
		
		
	}

}
