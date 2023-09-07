
public class reverse_eachword_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reverse each word of the string
		String str="I love my india";
		String[] words=str.split(" ");
		String reversestring="";
		for(String w:words) {
			String rev="";
			for (int i=w.length()-1;i>=0;i--) {
				rev+=w.charAt(i);
			}
			reversestring+=rev+" ";
		}
		System.out.println(reversestring);
		
	}

}

//reverse the sentence
/*String s="My name is sraban";
String[] s1=s.split(" ");
String rev="";
for(int i=s1.length-1;i>=0;i--) {
	rev+=s1[i] +" ";
}
System.out.println(rev);
*/


//reverse the string
/*
 
		String str= "Sraban";
		String rev= " ";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println(rev);
 */