
public class maximunandminimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find the minimun & maximum number in the array
		
		int a[]={50,30,40,20,60};
		int max=a[0];
		for (int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("maximin number of the array: "+max);
		
		int min=a[0];
		for (int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("minimum number of the array: "+min);
	}

}
