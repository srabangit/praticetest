 import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Spliterator;

public class countn_number_ofwords_instring {

	

	public static void main(String[] args) 
	{
		//count number of word present how many times	
 String s="i love india & i love odisha";
 String[] s1=s.split(" ");
 HashMap<String,Integer>map=new HashMap<String,Integer>();
 for(String s2:s1){
    if(map.containsKey(s2)) {
 map.put(s2,map.get(s2)+1);
 }else{
 map.put(s2,1);
 }
 }
 System.out.println(map);
 for(Map.Entry<String, Integer> entry :map.entrySet()) { {
	 System.out.println(entry.getKey()+" is present" + entry.getValue() +" times ");
 }
 
	 
 }
	}
}
	

