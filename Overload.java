package projects;

public class Overload {
	  
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

Overload ob=new Overload();
       ob.area(10,15);
       ob.area(3);  
   }
}



