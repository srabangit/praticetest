
public class removespecialcharacter {

	
	  
	public static void main(String args[])   
	{  
	/*String str= "This#string%contains^special*characters&.";   
	str = str.replaceAll("[^a-zA-Z0-9]", " ");  
	System.out.println(str);  */
		
		String s="abc!jhh#0987$jhhhh";
		String s1=s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s1);
	}
}