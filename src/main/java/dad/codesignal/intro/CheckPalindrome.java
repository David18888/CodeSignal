package dad.codesignal.intro;

public class CheckPalindrome {

	public static boolean checkPalindrome(String inputString){
	    
	    int i = 0;
	int j= inputString.length()-1;
	boolean aux = false;
	  
	    
	    while ((i<j) && (!aux)){
	 
		if (inputString.charAt(i)==inputString.charAt(j)){				
			i++;
			j--;
		} else {
			aux = true;
		}
	}
	    
	    
	    
	    return !aux;
	    
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(checkPalindrome("aba"));
		System.out.println(checkPalindrome("hola"));
		System.out.println(checkPalindrome("amamaromaleavivaelamorapapayapaparomaleavivaelamoramama"));
		System.out.println(checkPalindrome("nopalindromo"));
		System.out.println(checkPalindrome("fhsdfbsd"));
		System.out.println(checkPalindrome("ana"));


	}

}
