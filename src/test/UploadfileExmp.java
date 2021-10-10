package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadfileExmp {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

	        WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.monsterindia.com/seeker/registration");
			
			System.setProperty("webdriver.gecko.driver","geckodriver");
			
			driver.manage().window().maximize();
			
			//WebElement file = driver.findElement(By.xpath("//input[@type='file']"));
			//file.sendKeys("/home/devupadhcisco/eclipse-workspace/Web_Driver1/DEV.txt");
			
			
			WebElement file = driver.findElement(By.xpath("//*[@class='upload-file']"));
	        file.click();
	  
	        // creating object of Robot class
	        Robot rb = new Robot();
	     
	        // copying File path to Clipboard
	        StringSelection str = new StringSelection("/home/devupadhcisco/eclipse-workspace/Web_Driver1/DEV.txt");
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	     
	         // press Contol+V for pasting
	         rb.keyPress(KeyEvent.VK_CONTROL);
	         rb.keyPress(KeyEvent.VK_V);
	     
	        // release Contol+V for pasting
	        rb.keyRelease(KeyEvent.VK_CONTROL);
	        rb.keyRelease(KeyEvent.VK_V);
	     
	        // for pressing and releasing Enter
	        rb.keyPress(KeyEvent.VK_ENTER);
	        rb.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
