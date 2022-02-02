package projects;

public class CallbyValue {
	 int data=50;  
	  
	 void change(int data){  
	 data=data+100; 
	 }  
	     
	 public static void main(String args[]){  
	   CallbyValue op=new CallbyValue();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);  
	  
	 }  

}
