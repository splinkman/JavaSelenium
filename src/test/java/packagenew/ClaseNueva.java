package packagenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClaseNueva {
public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
		"D:\\DriversBrowser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("gh-ac")).click();
		driver.findElement(By.id("gh-ac")).sendKeys("Zapatillas");
		driver.findElement(By.id("gh-btn")).click();		
		//driver.findElement(By.cssSelector("a[href='https://www.ebay.com']")).click();		
		//driver.findElement(By.cssSelector("a#gh-la")).click();	
		driver.findElement(By.cssSelector("a[class*='gh-p']")).click();	
		//driver.findElement(By.cssSelector("a[href='//www.mercadolibre.com.pe']")).click();
		
		
		
		} 
}