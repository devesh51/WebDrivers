package test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		
		System.setProperty("webdriver.gecko.driver","geckodriver");
		
		driver.manage().window().maximize();	
		
		WebElement Link = driver.findElement(By.linkText("Terms of Use"));
		
		String KeystoSend = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		Link.sendKeys(KeystoSend);
		
        ArrayList<String> allWindows = new ArrayList<String> (driver.getWindowHandles());
        
        for(String window: allWindows) {
            
            System.out.println(window);
            
        }
        
        driver.switchTo().window(allWindows.get(1));
        
        WebElement element = driver.findElement(By.tagName("h1"));
        
        System.out.println(element.getText());
        
        driver.quit();
	}

}
