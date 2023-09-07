import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class stringoccurance {

	public static void main(String[] args) {
			
				
		String s="Srabansahoo";
		char[] ch=s.toCharArray();
		HashMap<Character, Integer>map=new HashMap<Character, Integer>();
		for(char c:ch) {
			if (map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}else {
				map.put(c,1);
			}
		}
			System.out.println(map);
			for(Map.Entry<Character, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey() +" is present "+ entry.getValue() +" times");
			}
		
	}
}


