package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccountCreation  {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		WebElement selectcountry=driver.findElement(By.xpath("//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/canada.svg'][1]"));
		selectcountry.click();
		WebElement ac=	driver.findElement(By.xpath("//span[text()='Account']"));
		ac.click();
		WebElement create=driver.findElement(By.xpath("//span[text()='Create an account']"));
		create.click();
		
		
		
		
		WebElement First=driver.findElement(By.id("firstName"));
		First.click();
		First.sendKeys("janakiraman");
		
		WebElement last=driver.findElement(By.id("lastName"));
		last.click();
		last.sendKeys("p");
		
		WebElement mail=driver.findElement(By.id("email"));
		mail.click();
		mail.sendKeys("karthickjpkl@gmail.com");
		
		WebElement pass=driver.findElement(By.id("password"));
		pass.click();
		pass.sendKeys("Abi@jani143");
		
		
		
		WebElement checkbox=driver.findElement(By.id("newsletter"));
		checkbox.click();
	
		
		WebElement sub=driver.findElement(By.xpath("//span[text()='Create Account']"));
		sub.click();
	
	String AccTitle=driver.getTitle();
System.out.println(AccTitle);	
Assert.assertEquals("Best Buy", AccTitle);
	}
	
	
	
	
	
	
	

}
