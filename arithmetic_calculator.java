package myproject;

import java.util.Scanner;

public class arithmetic_calculator {
	  public static void main(String[] args) {
	      int num1;
	      int num2;
	      int ans;
	      char op;
	      Scanner sc = new Scanner(System.in);
	      Scanner reader = new Scanner(System.in);
	      
	      System.out.println("enter the number-1? ");
			
			num1 = sc.nextInt();
			
			System.out.println("enter the number-2?");
			
			num2 = sc.nextInt();
			
	      System.out.print("\nEnter an operator (+, -, *, /): ");
	      op = reader.next().charAt(0);
	      switch(op) {
	         case '+': ans = num1 + num2;
	            break;
	         case '-': ans = num1 - num2;
	            break;
	         case '*': ans = num1 * num2;
	            break;
	         case '/': ans = num1 / num2;
	            break;
	      default: System.out.printf("Error! Enter correct operator");
	         return; 
	      }
	      System.out.print("\nThe result is:\n");
	      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
	      sc.close();
	      reader.close();
	   }
	}