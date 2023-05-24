package project;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bottomlink {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.bestbuy.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement selectcountry=driver.findElement(By.xpath("//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/canada.svg'][1]"));
		selectcountry.click();
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
je.executeScript("window.scrollBy(0,10000)", "");

List<WebElement> links=driver.findElements(By.xpath("//div[@class='linkGroup_2umUK']"));
Iterator it=links.iterator();
if(it.hasNext()) {
	
WebElement a=(WebElement) it.next();

String b=a.getText();
System.out.println(a.getSize());
System.out.println(b);
Assert.assertTrue(true);

List<WebElement> alllinks=driver.findElements(By.xpath("//a[@href='/order/en-ca']"));

Iterator<WebElement> it1=alllinks.iterator();
if(it1.hasNext()) {
	WebElement c=it1.next();
	System.out.println(c.getSize());
	System.out.println(c.getText());
	
	
	
	
}





}


	}

}
