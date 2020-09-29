package dad.codesignal.intro;

public class MakeArrayConsecutive2 {
	
	
	public static int makeArrayConsecutive2(int[] statues) {
		   
	     int resta=0;
	 
	    // Arrays.sort(statues);
	     
	     for(int i=0;i<statues.length-1;i++){
	         resta+=statues[i+1]-statues[i]-1;
	          
	          
	          
	     }return resta;
	     
	     
	      
	        
	        
	    

	}


	public static void main(String[] args) {
		

	}

}
