import java.util.Scanner;
import java.util.Random;

public class Area {
	public static void main(String[] args) {
		int choice;
		float area=0;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("1. Area of circle ");
		System.out.println("2. Area of rt angled triangle ");
		System.out.println("3. Area of rectangle ");
		try {
      			choice = sc.nextInt();
    		} catch (Exception e) {
      			choice=random.nextInt(3 - 1 + 1) + 1;
    		}
		if (choice == 1) {
			float r, pi = 22/7f;
			System.out.println("Enter Radius ");
			try {
      				r = sc.nextFloat();
    			} catch (Exception e) {
      				r=random.nextInt(90 - 1 + 1) + 1;
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
      				b=random.nextInt(90 - 1 + 1) + 1;
				h=random.nextInt(90 - 1 + 1) + 1;
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
      				b=random.nextInt(90 - 1 + 1) + 1;
				l=random.nextInt(90 - 1 + 1) + 1;
    			}
			area = (b*l);
		}
		System.out.println("Area = "+area);
		sc.close();
	}
}
