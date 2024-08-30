package week5.Day2.HomeAssingments;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.console.model.ConsoleMessage.Source;
import org.openqa.selenium.support.ui.Select;

public class TestLeafCreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		WebElement userNameField = driver.findElement(By.id("username"));
		userNameField.sendKeys("demosalesmanager");
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class=\"decorativeSubmit\"]")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys("Selenium Automation Tester-suganya");
		WebElement Industry = driver.findElement(By.xpath("//select[@name=\"industryEnumId\"]"));
		Select Industry1=new Select(Industry);
		Industry1.selectByVisibleText("Computer Software");
		WebElement ownership = driver.findElement(By.xpath("//select[@name=\"ownershipEnumId\"]"));
		Select ownership1=new Select(ownership);
		ownership1.selectByVisibleText("S-Corporation");
		WebElement Source = driver.findElement(By.xpath("//select[@name=\"dataSourceId\"]"));
		Select Source1 = new Select(Source);
		Source1. selectByValue("LEAD_EMPLOYEE");
		WebElement marketingCampaignId = driver.findElement(By.xpath("//select[@name=\"marketingCampaignId\"]"));
		Select marketingCampaignId1 = new Select(marketingCampaignId);
		marketingCampaignId1.selectByIndex(6);
		WebElement generalStateProvinceGeoId = driver.findElement(By.xpath("//select[@name=\"generalStateProvinceGeoId\"]"));
		Select generalStateProvinceGeoId1 = new Select(generalStateProvinceGeoId);
		generalStateProvinceGeoId1.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		
		
		
		
	}

	private static By byid(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static By ByXPath(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
