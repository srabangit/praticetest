
public class sumofelementinarray {

	public static void main(String[] args) {
		
		//find the sum of element in array
		
		int a[]= {5,6,7,8,9};
		int total=a.length;
		int sum=0;
		for(int i=0;i<total;i++) {
			sum=sum+a[i]; 
		}
		System.out.println("Print the total sum of the array:" +sum);
		
	}

}
