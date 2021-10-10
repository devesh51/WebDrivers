package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		System.setProperty("webdriver.gecko.driver","geckodriver");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        List <WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        
        List <WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
        
       
        System.out.println("no of rows are:" + rows.size());
        System.out.println("no of columns are:" + columns.size()); 
        
        
        WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
        System.out.println(data.getText());
        
        for(int i=2;i<rows.size();i++) {
        WebElement data1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[1]"));
        System.out.println(data1.getText());
    
        }
        
        
        List<WebElement> da = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        List <String> dta = new ArrayList<>();
        for(WebElement ele : da) {
            dta.add(ele.getText());
            System.out.println(ele.getText());
        }
        
		WebElement elem = driver.findElement(By.xpath("//*[text()='Define an HTML Table']")); 
				
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", elem);
	

	}

}
