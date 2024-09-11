package MarathonTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMarathon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver drivers = new ChromeDriver();
		drivers.get("https://www.amazon.in/");
		drivers.manage().window().maximize();
		drivers.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement searchField = drivers.findElement(By.id("twotabsearchtextbox"));
		searchField.sendKeys("Bags for boys",Keys.ENTER);
		System.out.println("1-48 of over 70,000 results for"+" " + "Bags for boys");
		drivers.findElement(By.xpath("//li[@id='p_123/418063']/span")).click();
		drivers.findElement(By.xpath("//li[@id='p_123/648962']/span")).click();
		drivers.findElement(By.xpath("//span[@tabindex=\"-1\"]")).click();
		drivers.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		drivers.findElement(By.xpath("//span[text()='Bloom 30 Litres Neon Green School Bag For Girls']")).click();
		System.out.println("Brand Skybags="+"Bloom 30 Litres Neon Green School Bag For Girls");
		System.out.println("Rs.2,500"+" "+"Discount 60%"+" "+"Discount price RS.999/-");
		drivers.close();
		
		
	}
	}
		
		




