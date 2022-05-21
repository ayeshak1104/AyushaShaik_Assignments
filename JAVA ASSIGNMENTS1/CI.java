

import java.util.Scanner;

public class CI 
{

	public static void main(String[] args) 
	{
       Scanner input = new Scanner(System.in);
		System.out.println("Enter the principal:");
		double P = input.nextDouble();
		
		System.out.println("Enter the rate:");
		double R = input.nextDouble();
		
		System.out.println("Enter the time:");
		double T = input.nextDouble();
		
		System.out.println("Enter number of time interest compounded: ");
		double num = input.nextDouble();
		
		double interest = (P * (Math.pow((1 + R/100), (T * num)))-P);
		System.out.println("principal: " + P);
		System.out.println("Interest rate: " + R);
		System.out.println("Time Duration: " + T);
		System.out.println("Number of Time interest compounded: " + num);
		System.out.println("Compound Interest: " + interest);
		
		input.close(); }
}
