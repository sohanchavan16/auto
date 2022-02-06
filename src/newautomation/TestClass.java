package newautomation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {

	@AfterClass
	public void afterclass(){
		System.out.println("after CLASS");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("BEFORE TEST");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("BEFORE METHOD");
	}
	
	 @Test
	 public void LoginFaceBook() {
		// WebDriver driver= browser3.browser("https://www.facebook.com/");
		 //pom po = new pom(driver);
		 //po.username("chavan");
		 //po.password("2222");
		 //po.login();
		 System.out.println("tree");
	 }
	 
	
	

}
