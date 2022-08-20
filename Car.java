package basic_oops1;

public class Car {
	String name;
	int price;
	String color;
	public void setvalue(String n,int p,String c) {
		name=n;
		price= p;
		color=c;
	}
	public void displaycar()
	{
		System.out.println("car name is:"+name);
		System.out.println("car price is :"+price);
		System.out.println("car color is :"+color);
	    System.out.println("======================");
	}
 }


