package dad.codesignal.intro;

public class CenturyFromYear {
	
	public static int centuryFromYear(int year) {
		
		    return 1 + (year - 1) / 100;
		}

		  
		    
		  
		



	public static void main(String[] args) {
	
		System.out.println(centuryFromYear(2017));
		System.out.println(centuryFromYear(1817));
		System.out.println(centuryFromYear(1207));
		System.out.println(centuryFromYear(2000));
		System.out.println(centuryFromYear(1453));
		System.out.println(centuryFromYear(1546));

	}

}
