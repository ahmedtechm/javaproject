package school;

public class Casting {
	
	// create type variables
	static int i = 4;
	static double  d = 44.5;
	static String a = "1234";

	
	public static void main(String[] args) {		
	
		//Covert Integer to Double
		double ii =(double)i;
		System.out.println("\nCovert Integer to Double:" +ii);
		
		//Covert Double to Integer
		int db =(int)d;
		System.out.println("\nCovert Double to Integer :" +db);
		
		//Covert Double to String
		String s = Double.toString(d);
		System.out.println("\nCovert Double to String :" +s);
		
		// Convert Integer to string type
	    String data = String.valueOf(i);
	    System.out.println("\nCovert Integer to String : " + data);
		
		//Covert String to Integer
		int b = Integer.parseInt(a);
		System.out.println("\nCovert String to Integer :" +b);
		
		//Covert String to Double
		double da = Double.parseDouble(a);
		System.out.println("\nCovert String to Double:" +da);
        

	
	}

}
