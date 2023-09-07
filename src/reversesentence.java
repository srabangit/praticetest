
public class reversesentence {
	
	public static void main(String[] args) {
        /*String input = "My name is Sraban";
        String s[] = input.split(" ");
        String res = "";
        for (int i = s.length - 1; i >= 0; i--) {
            res += s[i] + " ";
        }

        //System.out.println(res.substring(0, res.length() - 1));
        System.out.println("print: "+res);
    }


}*/




String s="My name is sraban";
String[] s1=s.split(" ");
String rev="";
for(int i=s1.length-1;i>=0;i--) {
	rev+=s1[i] +" ";
}
System.out.println(rev);
}
}