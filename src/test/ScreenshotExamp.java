package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExamp {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		System.setProperty("webdriver.gecko.driver","geckodriver");
		
		driver.manage().window().maximize();
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@gmail.com");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("#DEVyut0");
		
	    WebElement Rememeber =driver.findElement(By.className("rememberMe"));
	    Rememeber.click();
		
		
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();
		
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String Actualmsg= Error.getText();
		String Expmsg="The email or password you have entered is invalid.";
		
		//TakesScreenshot tsobj = (TakesScreenshot) driver;
		//File imag = tsobj.getScreenshotAs(OutputType.FILE);
		
		//FileUtils.copyFile(imag, new File("screenshot.png"));
		
		if(Actualmsg.equals(Expmsg)) {
			
			
			System.out.println("testcase passed");
		}else {
			
			TakesScreenshot tsobj = (TakesScreenshot) driver;
			File imag = tsobj.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imag, new File("screenshot1.png"));
			System.out.println("failed");
		}
		

	}

}
