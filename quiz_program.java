package projects;

import java.util.Scanner;
public class quiz_program {

	
	
	public static void main(String[] args) {
		int n;
		Scanner  sc = new Scanner(System.in);
		
		while (true) {
		
	System.out.println("who is the founder of blue origin?");
	System.out.println("1.bill gates\n2.tim cook\n3.nadella\n4.jeff bezos\n5.Exit program");
	
	System.out.println("\nchoose ur choice(1/2/3/4/5)?");
	n = sc.nextInt();
	
 
	if (n == 4) {
		System.out.println("congraluations! correct answer");
		break;
		
	}
	else if(n == 5) {
		break;
		
	}
	else {
		System.out.println("wrong answer!! try again");
			
	}	
	}
	}

}
