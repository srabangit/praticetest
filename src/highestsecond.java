
public class highestsecond {

	public static void main(String[] args) {
		
		int a[]= {10,30,20,40,35};
		int temp;
		int total=a.length;
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
     // int total;
	//return a[total-2];
	System.out.println("second largest is::"+a[total-2]);
	//note :--if it 2nd largest means -1 ,if 3rd largest means -2 ,highest means only total , like that
	
	
	/* public static void main(String args[]){
	      int temp, size;
	      int array[] = {10, 20, 25, 63, 96, 57};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("2nd Smallest element of the array is:: "+array[0]);*/
	   }
	
	
	
	 }
