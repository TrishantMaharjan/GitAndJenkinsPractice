import java.util.Scanner;
import java.util.Random;

public class Area {
	public static void main(String[] args) {
		int choice;
		float area=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Area of circle ");
		System.out.println("2. Area of rt angled triangle ");
		System.out.println("3. Area of rectangle ");
		try {
      			choice = sc.nextInt();
    		} catch (Exception e) {
			Random random = new Random();
      			choice=random.nextInt(3 - 1 + 1) + 1;
    		}
		if (choice == 1) {
			float r=7, pi = 22/7f;
			System.out.println("Enter Radius ");
			try {
      				r = sc.nextFloat();
    			} catch (Exception e) {
      				r=7;
    			}
			area = (pi*r*r);
		}
		if (choice == 2) {
			float b, h;
			try {
      				System.out.println("Enter Breadth ");
				b = sc.nextFloat();
				System.out.println("Enter Height ");
				h = sc.nextFloat();
    			} catch (Exception e) {
      				b=7;
				h=9;
    			}
			area = (b*h)/2;
		}
		if (choice == 3) {
			float l, b;
			try {
      				System.out.println("Enter Length ");
				l = sc.nextFloat();
				System.out.println("Enter Breadth ");
				b = sc.nextFloat();
    			} catch (Exception e) {
      				b=7;
				l=9;
    			}
			area = (b*l);
		}
		System.out.println("Area = "+area);
		sc.close();
	}
}
