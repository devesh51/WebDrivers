package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver", "chromedriver");
		
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
		
		
		if(Actualmsg.equals(Expmsg)) {
			System.out.println("testcase passed");
		}else {
			System.out.println("failed");
		}
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are :"+ Links.size());
		
		for(WebElement data : Links) {
            //System.out.println(data.getText());
            System.out.println("Target URL is : " + data.getAttribute("href"));
        }
		
		
		
		//WebElement forgot = driver.findElement(By.partialLinkText("Forgot"));
		//forgot.click();
		

		
		//driver.findElement(By.id("rememberMe")).isEnabled();
		
		driver.quit();
		//driver.close();
		
		
		//WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://github.com/mozilla/geckodriver/releases");
	}

}
