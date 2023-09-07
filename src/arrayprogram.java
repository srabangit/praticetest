
public class arrayprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//second highest number

		int arr[  ] = { 11, 21, 13, 4, 50 };
		  
		  int total=arr.length;
		  int temp;
		  for(int i=0;i<total;i++){
		  for(int j=i+1;j<total;j++){
		  if(arr[i]>arr[j]){
		  temp=arr[i];
		  arr[i]=arr[j];
		  arr[j]=temp;
		 }
		  }
		  }
		  System.out.println("second highest number:"+arr[total-2]);
		 	}
}
		
		//2nd highest number in array
		/*int arr[  ] = { 11, 21, 13, 4, 50 };

		int total =arr.length;
		int temp;
		for(int i=0; i<arr.length;i++){
		for (int j=i+1;j<arr.length;j++){
		if(arr[i]>arr[j]){
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		}
		}
		System.out.println("second highest number: "+arr[total-2]);
		
		    }


	}*/
/*
 * int arr[  ] = { 11, 21, 13, 4, 50 };
 * 
 * int total=arr.length;
 * int temp;
 * for(int i=0;i<total;i++){
 * for(int j-i+1;j<total;j++){
 * if(arr[i]>arr[j]){
 * temp=arr[i];
 * arr[i]=arr[j];
 * arr[j]=temp;
 * }
 * }
 * }
 * system.out.println("second highest number:+arr[total-2]");
 * 
 * 
 * 
 * 
 * 
 */


