package Selenium.FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scripting {
	public void checkout() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chrome-win32.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[1]/span[1]/select[1]")).click();
	driver.findElement(By.xpath("//option[contains(text(),'Price (low to high)')]")).click();
	driver.findElement(By.xpath("//div[@class='inventory_item_name ']")).click();
	driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();	
	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	driver.findElement(By.id("checkout")).click();
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Fateh");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Alam");
	driver.findElement(By.id("postal-code")).sendKeys("5408");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[id='continue']")).click();
	driver.findElement(By.cssSelector("button[id='finish']")).click();
	//driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]")).getText();
	 String thankYouText = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]")).getText();
	 System.out.println("Thank you text: " + thankYouText);
}
	}
