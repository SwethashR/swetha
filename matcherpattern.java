package assignment3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matcherpattern {
	public static void main(String[] args) {
		 Pattern p = Pattern.compile("\\p {}");
	     Matcher m= p.matcher("a.wFvLrl2xQjyrWrxeNI21@#9w");
	     int count=0;
	     while (m.find()){
	         count++;
	         System.out.println("Start "+m.start()+"________"+"End "+m.end()+"_________"+"Group "+m.group());

	     }
	    
	    Pattern p1 = Pattern.compile ("\\{Digits}");
	    Matcher m1 = p.matcher("a.wFvLrl2xQjyrWrxeNI21@#9w");
	    int count1=0;
	    while(m1.find()) {
	        count1++;
	        System.out.println("Start"+m1.start()+"__________"+"End"+m1.end()+"______"+"Group "+m1.group());

	    }

	    System.out.println("numbers="+count);
	    System.out.println("special characters="+count1);
	    
	    
	    
	    
	    
	   

	}
	


	}


