package newautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertions {
	     WebDriver driver;
         @BeforeMethod
          
	public void beforemethod() {
		  driver=  browser3.browser("https://www.facebook.com/");
               
	}
            @Test
            public void loginFaceBook() {
            	pom p= new pom(driver);
            	p.username("sohan");
            	p.password("velocity");
            	SoftAssert assertion= new SoftAssert();
                 //  Assert.assertEquals(p.loginbuttondisplayed(),true);
            	assertion.assertEquals(p.loginbuttondisplayed(), true);
                String title=driver.getTitle();
                assertion.assertEquals(title,"FacebookLoginpage" );
                
               // Assert.assertEquals(title, "FacebookLoginpage");
                 p.login();
                 //assertion.assertAll();
            }
            
            
}
