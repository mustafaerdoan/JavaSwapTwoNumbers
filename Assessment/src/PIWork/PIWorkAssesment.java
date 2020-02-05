package PIWork;

import java.util.Scanner;

public class PIWorkAssesment {

	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter two number");
		int x=scan.nextInt();
		int y=scan.nextInt();
		System.out.println(""+x);
		System.out.println(""+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping value of x "+x);
		System.out.println("value of y"+y);
	}

}
