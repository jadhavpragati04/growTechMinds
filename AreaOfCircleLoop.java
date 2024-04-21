import java.util.Scanner;

public class AreaOfCircleLoop {
	static final double pi = 3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int radius;
		double areaOfCircle;
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("Enter radius value: ");
			radius = sc.nextInt();
			areaOfCircle = (2 * pi * radius);
			System.out.println("Area of circle " +i+ "is: "+areaOfCircle);
		}


	}

}
