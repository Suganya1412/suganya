package Marathon3;

import java.rmi.Remote;
import java.sql.Driver;

import org.apache.poi.util.Removal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CreateOpportunity extends SalesForce {
	
@Test	
	public void createOpportunity() throws InterruptedException {
		
	//CLICK OPPORTUNITY
	WebElement ClickOpportunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	driver.executeScript("arguments[0].click();",ClickOpportunity);
	
	driver.findElement(By.xpath("//div[@title='New']")).click();
	
	Thread.sleep(3000);
	//OPPORTUNITYNAME GIVEN
	driver.findElement(By.xpath("//label[text()='Opportunity Name']"));
	
	WebElement Name = driver.findElement(By.xpath("//input[@name='Name']"));
	Name.sendKeys("Salesforce Automation by Suganya P.R");
	
	driver.findElement(By.xpath("//label[text()='Amount']"));
	
	WebElement Amount = driver.findElement(By.xpath("(//input[@inputmode='decimal'])[4]"));
	Amount.sendKeys("75000");
	
	//select date as 
	
	driver.findElement(By.xpath("(//input[@class='slds-input'])[6]")).click();
	
	Thread.sleep(3000);
	//select date for tomrow
	driver.findElement(By.xpath("(//table[@class='slds-datepicker__month'])//tr[1]/td[6]")).click();
	Thread.sleep(2000);
	//select stage
	/**
	driver.findElement(By.xpath("//label[text()='Stage']")).click();
	
	WebElement NA = driver.findElement(By.xpath("//button[@data-value='Needs Analysis']/span"));
	Actions NeedAnalysis = new Actions(driver);
	NeedAnalysis.doubleClick(NA).perform();
	
	//driver.executeScript("arguments[0].click();", NA);
	**/
	WebElement scroll = driver.findElement(By.xpath("//span[text()='Additional Information']"));
	
	WebElement stageDrowdown = driver.findElement(By.xpath("//label[text()='Stage']/following::button"));
	Actions ac = new Actions(driver);
	ac.scrollToElement(scroll).perform();
	stageDrowdown.click();
	
	driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	
	String msg = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
	System.err.println(msg);
	
	if(msg.contains("Opportunity")) {
		
		System.out.println("Opportunity SalesForce Created");
	}else {
		System.out.println("Opportunity SalesForce not Created");
	}
	}
}
