package project;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidatingMainMenu  extends SingIn{

	public static void main(String[] args) throws Exception {
		
		
		
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement selectcountry=driver.findElement(By.xpath("//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/canada.svg'][1]"));
		selectcountry.click();	
		WebElement shop=driver.findElement(By.xpath("//span[@data-automation='x-shop']"));
		shop.click();
		String b=shop.getText();  
		System.out.println(b);
		System.out.println("Shop".equals(b));
		
		WebElement early=driver.findElement(By.xpath("//a[text()='Early Summer Sale']"));
		early.click();
		
	List<WebElement> sport=driver.findElements(By.xpath("//a[@class='menuLink_Py2IM']")) ;
	Iterator<WebElement> it=sport.iterator();
	while(it.hasNext()) {
		WebElement a=it.next();
		String c=a.getText();
		System.out.println(c);
		
		
	}
	WebElement brand=driver.findElement(By.xpath("//span[@data-automation='x-brands']"));
	brand.click();
	
	String d=brand.getText();
	System.out.println(d);
	System.out.println("Brands".equals(d));
	Thread.sleep(2000);
	
	WebElement popular=driver.findElement(By.xpath("//a[@title='Popular Brands']"));
	popular.click();
	
	List<WebElement> brands=driver.findElements(By.xpath("//a[@class='menuLink_Py2IM']"));
	Iterator<WebElement> it1=brands.iterator();
	while(it1.hasNext()) {
		WebElement s=it1.next();
		
		String t=s.getText();
		System.out.println(t);
		
	}
	
	WebElement deal=driver.findElement(By.xpath("//span[@data-automation='x-deals']"));
	deal.click();
	
	String e=deal.getText();
	System.out.println("Deals".equalsIgnoreCase(e));
	
	
	List<WebElement> deals=driver.findElements(By.xpath("//a[@class='menuLink_Py2IM']"));
	Iterator<WebElement> it2=deals.iterator();
	while(it2.hasNext()) {
		WebElement u=it2.next();
		
		String v=u.getText();
		System.out.println(v);
		
	}
	
	WebElement service=driver.findElement(By.xpath("//span[@data-automation='x-services']"));
	deal.click();
	String f=service.getText();
	System.out.println(f);
	System.out.println("services".equalsIgnoreCase(f));
	Thread.sleep(2000);
	List<WebElement> ser=driver.findElements(By.xpath("//a[@class='menuLink_Py2IM']"));
	Iterator<WebElement> it3=ser.iterator();
	while(it3.hasNext()) {
		WebElement y=it3.next();
		
		String z=y.getText();
		System.out.println(z);
	}
	
	
	
	}
	
	

}
