/*ublic class duplicarray {
//duplicate element in array
	public static void main(String[] args) {
		int[] my_array= {1, 2, 5, 5, 6, 6, 7, 2};
		for (int i=0;i<my_array.length-1;i++) {
			for(int j=i+1;i<my_array.length;j++) {
				if((my_array[i] == my_array[j]) && (i != j)) {
					System.out.println("duplicate number :"+my_array[j]);
				}
			}
		}

}
	}
	
//get the duplicate element in array
/*
 * public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"aaa","bb","cc","aaa","bb"};
		
		HashSet<String>set1=new HashSet<String>();
		for(String s1:str) {
			if(!set1.add(s1)) {
				System.out.println("duplictae is :"+s1); 
			}
		}
		

	}
 * 
 */

		
	 /*int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
		  
	        for (int i = 0; i < my_array.length-1; i++)
	        {
	            for (int j = i+1; j < my_array.length; j++)
	            {
	                if ((my_array[i] == my_array[j]) && (i != j))
	                {
	                    System.out.println("Duplicate Element : "+my_array[j]);
	                }
	            }
	        }
	    }    
	}*/

import java.util.HashSet;
