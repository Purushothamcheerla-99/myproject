package projects;



public class Type_casting {

	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");
		
		int a=35;
	    
		float b=a;
		
		System.out.println("The float value: "+b);
		
		long c=a;
		
		System.out.println("The long value: "+c);
		
		double d=c;
		
		System.out.println("The double value: "+d);
		
				
		
		System.out.println("Explicit Type Casting");
		
		
		double x=78.5;
		
		int y=(int)x;
		
		System.out.println("The double value: "+x);
		
		System.out.println("The int value: "+y);
		
		System.out.println("wrapper class");
		
		String A = "500";
	
		System.out.println("The string value:"+A);
		
		
		int B  = Integer.parseInt(A);
		
		System.out.println("The int value:"+B);
		
	}
}

	