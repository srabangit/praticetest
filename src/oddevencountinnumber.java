
public class oddevencountinnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//count number of even & odd digit available in number
		int num=12345;
		int evencount=0;
		int oddcount=0;
		while(num>0){
			
			int reminder=num%10;
			if(reminder%2==0) {
				evencount++;
				
			}else {
				oddcount++;
				
			}
			
			num=num/10;
		}
		System.out.println("number of even count is:" +evencount);
		System.out.println("number of even count is:" +oddcount);
	}

}
