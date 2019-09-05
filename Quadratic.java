import java.util.*;

class Roots {

	public static void main (String args[]) {

		int a, b, c;
		float d, root1, root2;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter value of a,b & c");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		d = b*b - 4*a*c;
		
		if (d<0) System.out.println("No Roots");
		else {
			root1 = (float) (-b + Math.sqrt(d))/(2*a);
			root2 = (float) (-b - Math.sqrt(d))/(2*a);
			
			System.out.println("Root 1: " + root1 );
			System.out.println("Root 2: " + root2 );
		}
	}
}

