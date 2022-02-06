package newautomation;

import org.openqa.selenium.WebDriver;


public class test4 {

	public void TestWithValidUser() {
		WebDriver driver= browser3.browser("https://www.facebook.com/");
		
			pom po = new pom(driver);
			po.username("sohan");
			po.password("1234");
			po.login();
	}
			
			public void TestWithInValiduser() {
			WebDriver driver= browser3.browser("https://www.facebook.com/");
			pom po= new pom(driver);
			po.username("122333");
			po.password("qasdd");
			po.login();
		}
			public void testivalidpass() {
				WebDriver driver= browser3.browser("https://www.facebook.com/");
				pom po= new pom(driver);
				po.username("sohan");
				po.password("");
				po.login();
			}
	
			 public static void main(String[] args) {
			  test4 t= new test4();
			  t.TestWithValidUser();
			  t.TestWithInValiduser();
			  
		

		}

	}
