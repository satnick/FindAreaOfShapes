package shapepac;

import java.util.Scanner;
public class FindArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		Rectangle rec = new Rectangle(a, b);
		rec.area();
		rec.display();

		a=s.nextInt();
		b=s.nextInt();
		
		Triangle tri = new Triangle(a,b);
		tri.area();
		tri.display();
		
		
	}

}
