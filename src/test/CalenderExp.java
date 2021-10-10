package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		System.setProperty("webdriver.gecko.driver","geckodriver");
		
		driver.manage().window().maximize();
		 
		driver.switchTo().frame(0);
		WebElement date = driver.findElement(By.id("datepicker"));
		//date.sendKeys("10/09/2019");
		date.click();
		
		//WebElement day = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='15']"));
	      // day.click();
	     
	    WebElement arrow = driver.findElement(By.xpath("//a[@title='Next']"));
	    WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
	        
	    String sMonth = month.getText();
	    
	    while(!sMonth.equals("June")) {
	    	arrow.click();
	    	month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
	    	arrow = driver.findElement(By.xpath("//a[@title='Next']"));
	    	sMonth = month.getText();
	    }
	    
	    WebElement day = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='15']"));
	    day.click();
		
		
	}       

}
