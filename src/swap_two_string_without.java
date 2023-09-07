 
public class swap_two_string_without {

	
	// Write a program to swap two String variables without third variable.
	public static void main(String args[]){
	      String s1 = "tutorials";
	      String s2 = "point";
	      System.out.println("Value of s1 before swapping :"+s1);
	      System.out.println("Value of s2 before swapping :"+s2);
	      int i = s1.length();
	      s1 = s1+s2;
	      s2 = s1.substring(0,i);
	      s1 = s1.substring(i);
	      System.out.println("Value of s1 after swapping :"+s1);
	      System.out.println("Value of s2 after swapping :"+s2);
	   }
}
