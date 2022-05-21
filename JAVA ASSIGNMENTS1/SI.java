import java.util.Scanner;

public class SI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the principal:");
		double p = input.nextDouble();
		
		System.out.println("Enter the rate:");
		double r = input.nextDouble();
		
		System.out.println("Enter the time:");
		double t = input.nextDouble();
		
		double interest = (p * t *r)/100;
		
		System.out.println("principal: " + p);
		System.out.println("Interest rate: " + r);
		System.out.println("Time Duration: " + t);
		System.out.println("Simple Interest: " + interest);
		
		input.close(); 
    }
}
