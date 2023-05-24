package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class SingIn {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement selectcountry=driver.findElement(By.xpath("//a[@class='canada-link'][1]"));
		selectcountry.click();
	WebElement ac=	driver.findElement(By.xpath("//span[text()='Account']"));
		ac.click();
		
		WebElement username=driver.findElement(By.id("username"));
		username.click();
		username.sendKeys("karthickjpkl@gmail.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.click();
		password.sendKeys("Abi@jani143");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='GSYpm']")).click();
		
		
		
		
	}

}
