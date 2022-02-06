package newautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;

public class table1 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= browser3.browser("https://demo.guru99.com/test/web-table-element.php");
		 Thread.sleep(1000);
		 List<WebElement>  row=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
       System.out.println(row.size());
       List<WebElement>   colomns=    driver.findElements(By.xpath("//table//tbody//tr[1]//td"));
       System.out.println(colomns.size());
       
       List<WebElement> heading=driver.findElements(By.xpath("//table//thead//tr//th"));
       
	}

}
