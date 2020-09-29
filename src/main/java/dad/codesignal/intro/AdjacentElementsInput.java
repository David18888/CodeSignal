package dad.codesignal.intro;

public class AdjacentElementsInput {
	
	public static int adjacentElementsProduct(int[] inputArray) {


	    
	     int i;
	     int j=inputArray[0]*inputArray[0+1]; 
	   
	    for (i =0; i < inputArray.length-1; i++) {
	           
	                  if (inputArray[i]*inputArray[i+1] > j) {
	                          j = inputArray[i]*inputArray[i+1];
	                  }            
	    }
	    
	    return j;
	}


	public static void main(String[] args) {
		int [] array= {4,1,1,7,8,9,2,3,5,4};
		int [] array1= {4,1,8,7,8,9,2,1,5,7};
		int [] array2= {4,1,6,7,6,9,2,3,6,5};
		int [] array3= {1,5,1,1,7,0,9,2,3,3,4};
		int [] array4= {2,1,3,6,8,6,2,3,1,3};
		
		
		
		System.out.println(adjacentElementsProduct(array));
		System.out.println(adjacentElementsProduct(array1) );
		System.out.println(adjacentElementsProduct(array2));
		System.out.println( adjacentElementsProduct(array3));
		System.out.println(adjacentElementsProduct(array4) );
		

	}

}
