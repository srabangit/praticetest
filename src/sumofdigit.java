
public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//find the sum of digit of number
		
		/*int n=12345;
		
		int sum=0;
		while(n>0) {
			int temp=n%10;
			sum=sum+temp;
			n=n/10;
			
		}
System.out.println(sum);
	}

}*/

//reverse of number

int n=121;
int rev=0;
while(n>0)
{
int temp=n%10;
rev=rev*10+temp;
n=n/10;
}
System.out.println(rev);
}
}





