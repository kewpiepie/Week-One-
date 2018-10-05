
public class Application {
	
	public static void main(String[] args) {
		System.out.println("");
		
	/* this is how i do 
		 * multiple lines 
		 * 
		 */ 

		/* primitive data- 8 types 
		 * int- an integer 
		 * double - decimal places 28.66665 
		 * float - precision decimal data type 45.3987 
		 * long - like an int, numbers can be higher 
		 * short - like an int, less of number range 
		 * byte - 8 bits of data 
		 * char - a single character A B C & 
		 * boolean - true or false
		 * 
		 *   objects : 
		 *   
		 *   string - is a textual data, a string of characters 
		 *   */ 

		// variable declaration - type, identifier, assignment operator, value, 
		// end with semicolon. 

		int age = 28;
		int weight = 110;
				
				
		//This data type will most likely be large enough for the
		//numbers your program will use,
		//but if you need a wider range of values, use long instead.
				
		byte small = -128; 
		byte big = 127;
		
		//The byte data type can be useful for saving memory in large arrays, 
		//where the memory savings actually matters.
		
		short s =123; 
		short s2 = 456; 
		
		//you can use a short to save memory in large arrays, 
		//in situations where the memory savings actually matters
		
		long l1 = 123456778; 
		long l2 = 98765432;
		
		//Use of this data type might be in banking application 
		//when large amount is to be calculated and stored.
		
		float interestrate = 12.25f; 
		float interest2 = 2.26f; 
		
		//Floating-point numbers, also known as real numbers,
		//are used when evaluating expressions that require fractional precision.
		
		double key = 12345.67d; 
		double key2 = 65432.89d; 
		
		//Double precision, as denoted by the double keyword,
		//uses 64 bits to store a value. 
		
		boolean dog = true; 
		boolean puppy = false;
		
		//The boolean data type has only two possible values: true and false. 
		
		char ch1 = 88; 
		char ch2 = 'Y'; 
		
		// In Java, the data type used to store characters  is char
		
		String str = new String ("I love pizza.");
		
		String str2 = new String ("My Dog's name is Elliott!");
		
		
		
		System.out.println(dog); 
	}

}


