package assignment3;

public interface inter {
	public static void main(String[] args) {
		
	        String s ="Software testing";
	        String s1=" Class";
	        
	        String s2= s.concat(s1);
	        String  s3=s.toUpperCase();
	        boolean s4=s.startsWith("Si");
	        String s5=s.replace("Software", "Bank");
	        System.out.println(s2);
	        System.out.println(s3);
	        System.out.println(s4);
	        System.out.println(s5);
	        
	       
	       String[] sp = s.split(" ");
	       
	        for(String e: sp){
	           System.out.println(e);
	       }
	        
	        try {
	            System.out.println("Testing");
	            
	        } catch (Exception e) {
	            
	            System.out.println("Handled");
	        }
	        finally {
	            System.out.println("Success");
	        }

		


		
	}

}
