import java.util.LinkedHashMap;

public class numberofvowel {
	
	/* NUmber of vowels present in string */
	
	
	public static void main(String[] args) {
		String s="Srabansahoo";
		
		 char[] ch=s.toCharArray();
		 int count =0;
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			 
				 count++;
			 }
			 System.out.println("vowel: "+count);
	

}
}
	

