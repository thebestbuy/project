package project;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopByDepart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement selectcountry=driver.findElement(By.xpath("//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/canada.svg'][1]"));
		selectcountry.click();	
		WebElement shop=driver.findElement(By.xpath("//span[@data-automation='x-shop']"));
		shop.click();
		WebElement early=driver.findElement(By.xpath("//a[text()='Early Summer Sale']"));
		early.click();
		
		WebElement sale=driver.findElement(By.xpath("//a[@title='Sports and Recreation On Sale']"));
		sale.click();
		System.out.println("janakirman");
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,2500)", "");
		System.out.println("p");
		
		WebElement electric=driver.findElement(By.xpath("//span[text()='Gyrocopters Avalanche 500W Electric City Bike with up to 64km Battery Range - Black']"));
		electric.click();
		
		WebElement elec=driver.findElement(By.xpath("//div[@class='sliderTarget_2Q87g'][1]"));
		elec.click();
		
		WebElement add=driver.findElement(By.xpath("//div[@class='addToCartLabel_YZaVX'][1]"));
		add.click();
				

	}

}
