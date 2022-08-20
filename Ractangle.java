package basic_oops1;

public class Ractangle {
	double width;
	double height;
	Ractangle(double w,int h){
		width=w;
	    height=h;
	}
       public void findarea() {
    	  double area=width*height;
    System.out.println("the ractangle is:"+area);
   }
       public static void main(String[]args)
       {
    	   Ractangle r1=new Ractangle(43,23);
    	   r1.findarea();
    	   Ractangle r2=new Ractangle(213,323);
    	   r2.findarea();
    	   
       }


}
