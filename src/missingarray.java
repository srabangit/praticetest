
public class missingarray {

	
		
 public static void main(String[] args) {
 
      //find the missing number in array

    /* int n=arr.length+1;
     int sum=n*(n+1)/2;
     int restSum=0;
     for (int i = 0; i < arr.length; i++) {
         restSum+=arr[i];
     }
     int missingNumber=sum-restSum;
     System.out.println("print the missingnumber :" +missingNumber);
    }*/
	 
	 int a[]= {1,2,3,5};
	 int sum1=0;
	 for (int i=0;i<a.length;i++)
	 {
		 sum1=sum1+a[i];
	 }
	 System.out.println("sum of given array:"+sum1);
	 
	 int sum2=0;
	 for(int i=1;i<=5;i++) {
		 sum2=sum2+i;
		 
	 }
	 System.out.println("sum of given array:"+sum2);
	 int missingnumber=sum2-sum1;
	 System.out.println("difference of given array:"+missingnumber);
	 
 }
}
