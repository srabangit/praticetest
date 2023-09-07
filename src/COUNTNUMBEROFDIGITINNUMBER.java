
public class COUNTNUMBEROFDIGITINNUMBER {

	public static void main(String[] args) {
		
//COUNT THE number of digit present in one number
		
		int num=12345;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("print the number of digit: "+count);
	}

}
