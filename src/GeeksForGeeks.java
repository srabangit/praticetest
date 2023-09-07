
public class GeeksForGeeks {
	 // Function to demonstrate printing pattern
	public static void main(String args[])
    {
       
    
    	
    	/*
    	 * 1 
           2 3 
           4 5 6 
           7 8 9 10 
           11 12 13 14 15 
    	 * 
    	 */
    	
    	
    	
        // initialising starting number
        /*int i, j, num=1;
         
        // outer loop to handle number of rows
        // n in this case
        for(i=0; i<n; i++)
        {
 
            // without re assigning num
            // num = 1;
            for(j=0; j<=i; j++)
            {
                // printing num with a space
                System.out.print(num+ " ");
                 
                // incrementing num at each column
                num = num + 1;
            }
 
            // ending line after each row
            System.out.println();
        }
    }*/
     
   
    	
    	int i,j,num=1;  // initialising starting number
    	int n=5;
    	for(i=0;i<n;i++) {
    		for(j=0;j<=i;j++) {
    			System.out.print(num+ " ");
    			num=num+1;
    		}
    		System.out.println();
    		}
    			 
    		
    	}
    	
    }

