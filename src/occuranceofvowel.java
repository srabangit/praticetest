import java.util.LinkedHashMap;
import java.util.Map;

public class occuranceofvowel {

	/* Question :-->String s="Srabansahoo" find the vowel present then check the occurance of the vowel*/
	
	 public static void main(String[] args) {
	      String str = "AEAIOG";
	      char[] ch=str.toCharArray();
	      LinkedHashMap<Character, Integer> hMap = new LinkedHashMap();
	      hMap.put('A', 0);
	    hMap.put('E', 0);
	   hMap.put('I', 0);
	   hMap.put('O', 0);
	   hMap.put('U', 0);
	      for (int i = 0; i <= str.length() - 1; i++) {
	         if (hMap.containsKey(str.charAt(i))) {
	            int count = hMap.get(str.charAt(i));
	            hMap.put(str.charAt(i), ++count);
	      /*for(char c:ch) {
	    	  if(hMap.containsKey("c")) {
	    		  hMap.put(c, hMap.get(c)+1);
	    	  }else {
	    		  hMap.put(c,1);
	            
	            
	         }      
	      }
	      System.out.println(hMap);
	      for(Map.Entry<Character, Integer> entry : hMap.entrySet()){
	    	  System.out.println(entry.getKey() + " is available " + entry.getValue() + " times"); 
	    	  
	      }*/
	    		  }}
	 }
}