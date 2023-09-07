
public class array_oddeven {

	public static void main(String[] args) {
		//find the odd even number in array
		
		int a[]= {1,2,3,4,5,6};
		System.out.println("even number in the array");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) 
				System.out.println(a[i]);
				
			}
		System.out.println("odd number in the array");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) 
				System.out.println(a[i]);
				
		}
		}
}
		


