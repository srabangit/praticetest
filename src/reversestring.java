
public class reversestring {

	public static void main(String[] args) {
		 
		//Write a program to reverse the string without using reverse function.
		
		String str= "Sraban";
		String rev= " ";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println(rev);

	}

}
