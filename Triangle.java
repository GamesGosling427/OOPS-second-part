package basic_oops1;

public class Triangle {
			double base;
			double height;
			
			Triangle(double b,double h)
			{
				base=b;
				height=h;
			}
		public void findarea() {
			double area=0.5*base*height;
			System.out.println("the area is:"+area);
		}
		public static void main(String[]args)
		{
			Triangle t1=new Triangle(12.1,32.1);
			t1.findarea();
			Triangle t2=new Triangle(12,54);
			t2.findarea();
		}
	}


