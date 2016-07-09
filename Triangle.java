package shapepac;

public class Triangle extends Shape {

	int base,height;
	double ar;
	
	public Triangle(int b, int h) {
		// TODO Auto-generated constructor stub
		base = b;
		height = h;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		super.area();
		ar = 0.5*base*height;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Area of triangle: "+ar);
	}

	
	
}
