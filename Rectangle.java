package shapepac;

public class Rectangle extends Shape {

	private int a,b,ar;
	public Rectangle(int len, int brd) {
		// TODO Auto-generated constructor stub
		a = len;
		b = brd;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		super.area();
		ar = a*b;
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("area of rectangle: "+ ar);
	}
	
	

}
