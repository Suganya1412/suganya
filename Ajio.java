package MarathonTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver drivers = new EdgeDriver();
		drivers.get("https://www.ajio.com/");
		drivers.manage().window().maximize();
		WebElement driversElement = drivers.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
		driversElement.sendKeys("bags",Keys.ENTER);
		Thread.sleep(3000);
		WebElement gender = drivers.findElement(By.xpath("//label[contains(text(),'Men')]"));
		gender.click();
		//drivers.findElement(By.xpath("//label[contains(text(),'Men')/label[Fashion Bags()]]")).click();
		Thread.sleep(3000);
		WebElement fashionBags = drivers.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]"));
		fashionBags.click();
		
		WebElement itemsFound = drivers.findElement(By.xpath("//div[@class=\"length\"]"));
		System.out.println(itemsFound.getText());
		Thread.sleep(1000);
		
		List<WebElement> brands = drivers.findElements(By.className("brand"));
		System.out.println("Brands");
		for (WebElement brand : brands) {
			System.out.println(brand.getText());
			
			List<WebElement> bagNames = drivers.findElements(By.className("nameCls"));
			System.out.println("Bag Names");
			for (WebElement bag : bagNames) {
				System.out.println(bag.getText()); {
				
			}
	}
		}
		
	}
}

