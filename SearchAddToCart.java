package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchAddToCart  {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		WebElement selectcountry=driver.findElement(By.xpath("//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/canada.svg'][1]"));
		selectcountry.click();
		WebElement box=driver.findElement(By.xpath("//input[@name='search']"));
		box.click();
		box.sendKeys("mobiles");
		WebElement clk=driver.findElement(By.xpath("//button[@aria-label='Search']"));
		clk.click();
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeAsyncScript("window.scrollBy(0,1000)", "");
		System.out.println("hello");
		WebElement show=driver.findElement(By.xpath("//span[text()='Show more']"));
		
JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",show);
		
		
		
		

	
	
	
		
		
		
	}

	
	

}
