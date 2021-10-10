package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameExample {

	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		System.setProperty("webdriver.gecko.driver","geckodriver");
		
		driver.manage().window().maximize();
		
		//driver.switchTo().frame("frame-top").switchTo().frame(0); //method1
		
		//driver.switchTo().frame("frame-top").switchTo().frame("frame-left"); //method2
		
		driver.switchTo().frame("frame-top").switchTo().frame(1);
		
		//driver.switchTo().frame(0).switchTo(1);
		
		//driver.switchTo().defaultContent();
		WebElement element = driver.findElement(By.tagName("body"));
		System.out.println(element.getText());
		
		//driver.switchTo().defaultContent();
   
		
		//frame within frame assignment
	}

}
