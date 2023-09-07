
public class stringduplicatecharacter {

	public static void main(String[] args) {
		 /*String str = "beautiful beach";
	      char[] carray = str.toCharArray();
	      System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (carray[i]== carray[j]) {
	               System.out.print(carray[j] + " ");
	               break;
	            }
	         }
	      }
	   }
}*/
		String s="beautiful garder";
		char[] ch=s.toCharArray();
		for (int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j] + " ");
					break;
				}
			}
		}
		
	}
}
		
