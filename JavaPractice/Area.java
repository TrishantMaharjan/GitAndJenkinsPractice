import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		int choice=1;
		float area=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Area of circle ");
		System.out.println("2. Area of rt angled triangle ");
		System.out.println("3. Area of rectangle ");
		choice = sc.nextInt();
		if (choice == 1) {
			float r=7, pi = 22/7f;
			System.out.println("Enter Radius ");
			r = sc.nextFloat();
			area = (pi*r*r);
		}
		if (choice == 2) {
			float b=2, h=3;
			System.out.println("Enter Breadth ");
			b = sc.nextFloat();
			System.out.println("Enter Height ");
			h = sc.nextFloat();
			area = (b*h)/2;
		}
		if (choice == 3) {
			float l=4, b=4;
			System.out.println("Enter Length ");
			l = sc.nextFloat();
			System.out.println("Enter Breadth ");
			b = sc.nextFloat();
			area = (b*l);
		}
		System.out.println("Area = "+area);
		sc.close();
	}
}
