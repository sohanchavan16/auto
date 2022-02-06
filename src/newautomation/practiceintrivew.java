package newautomation;

public class practiceintrivew {

	public static void main(String[] args) {
		
		StringBuffer a= new StringBuffer("sohan");
		System.out.println(a.reverse());
		   String org= "chavan";
           String rev= "";
           
           for (int i=org.length()-1; i>=0; i--) {
        	   rev=rev+org.charAt(i);
           }
        	   System.out.println(""+ rev);  
           
           System.out.println("" + org);  
         
           for (int i=1; i<=4; i++) {
        	   
           for (int j=1;j<=i; j++) 
        	 
        	   System.out.println(" *");
           }
	         System.out.println();
	}
	
	
                     
               
}
