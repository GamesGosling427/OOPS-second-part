package basic_oops1;

public class Cardrive {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.setvalue("maruti", 23544, "black");
		System.out.println(c1.name);
		System.out.println(c1.price);
		System.out.println(c1.color);
		}
}
