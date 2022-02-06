package newautomation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class excelsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	    WebDriver driver=  browser3.browser("https://www.facebook.com/");
	            
		
		String first=	fatchdatafromexcelsheet.getdata(0, 0);
	           WebElement email=  driver.findElement(By.xpath("//input[@type=\"text\"]"));
	                      email.sendKeys(first);
               String pass=fatchdatafromexcelsheet.getdata(0, 1);
           WebElement lpass=    driver.findElement(By.xpath("//input[@type=\"password\"]"));
            lpass.sendKeys(pass);
	}

}
