package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		System.setProperty("webdriver.gecko.driver","geckodriver");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement CreateAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		CreateAccount.click();
		
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select ddDay = new Select(Day);
		
		//ddDay.selectByVisibleText("14");
		
		ddDay.selectByValue("12");
		
		//ddDay.selectByIndex("3");
		
		
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select m = new Select(Month);
		
		//m.selectByVisibleText("Jan");
		
		m.selectByIndex(5);
		
		
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select y = new Select(Year);
		
		y.selectByValue("2020");
		

		WebElement Male = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		Male.click();
		
		if(Male.isEnabled()) {
			System.out.println("Radio button is selected");
			
		}else {
			System.out.println("not selected");
		}
		

	}

}
