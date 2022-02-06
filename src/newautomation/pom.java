package newautomation;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class pom {
		@FindBy(xpath="//input[@type=\"text\"]") private WebElement username;
		@FindBy(xpath="//input[@type=\"password\"]") private WebElement password;
		@FindBy(xpath="//button[@value=\"1\"]") private  WebElement login;
	    
		public pom(WebDriver driver) {
			PageFactory.initElements(driver, this);
			 

		}
		public void username(String name) {
			username.sendKeys(name);
			
			
		}
		public void password(String pass) {
			password.sendKeys(pass);
		}
	      public void login() {
	    	  login.click();
	      }
		
	      public   boolean loginbuttondisplayed() {
	    	boolean sd= login.isDisplayed();
			return sd;
	    	 
	      }
	      
	

}


