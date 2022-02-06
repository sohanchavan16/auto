package newautomation;

import org.testng.annotations.Test;

public class testkeywords {
	@Test()
	public void test(){
		
		System.out.println("test3");
	}
		
		@Test()
		public void TEST2() {
			System.out.println("test2");
			
			
			
		}
	
     @Test(dependsOnMethods= {"test"})
     public void TEST3()  {
    	  //Thread.sleep(3000);
    	System.out.println("test1");
     }
     
      
}
