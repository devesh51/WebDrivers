package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		System.setProperty("webdriver.gecko.driver","geckodriver");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement Header = driver.findElement(By.xpath("//h2"));
		
		if(Header.isDisplayed()) {
			
			System.out.println("Header is displayed");
		}else {
			
			System.out.println("Test fail, header is not displayed");
		}
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='email' or @id='email']"));
		
		System.out.println(UserName.getAttribute("placeholder"));
		
		UserName.sendKeys("abc@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//*[@name='pass']"));
		Password.sendKeys("abc@gmail");
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[@name='login']"));
		LoginButton.click();
		
	

	}

}
