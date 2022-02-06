package newautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public static void main(String[] args) {
		 WebDriver  driver= browser3.browser("https://www.facebook.com/");
		        driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();

		        WebDriverWait wait= new  WebDriverWait(driver,5);
		                   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"First name\"]"))).sendKeys("sohan");
		                   
		                   
		         WebElement lastname=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		         lastname.sendKeys("chavan");
	}
}
