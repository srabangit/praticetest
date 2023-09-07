
public class fibbonaic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int a=0;
		int b=1;
		for(int i=0;i<=5;i++) {
			int temp=a+b;
			a=b;
			b=temp;
			System.out.println(+temp);
		}*/

		int a=0;
		int b=1;
		int temp;
		for(int i=0;i<=5;i++){
			temp=a+b;
			a=b;
			b=temp;
			System.out.println(+temp);
		}
				
	}

}
