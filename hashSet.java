package TestSWT;

import java.util.HashSet;
import java.util.Set;




public class hashSet {
	
	 
	 private Set<String> number_elem = new HashSet<>();
	
		 
		public void add(String str)
		{
		    	 number_elem.add(str);
		    }
		    public boolean isEquals(String str){
		        return number_elem.contains(str);
		    }
	}
 


