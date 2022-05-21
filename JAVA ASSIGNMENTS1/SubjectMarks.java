package com.java;

import java.util.Scanner;

public class SubjectMarks {

	public static void main(String[] args) {
		int m1,m2,m3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First subject marks: ");
		m1=sc.nextInt();
		
		System.out.println("Enter second subject marks: ");
		m2=sc.nextInt();
		
		System.out.println("Enter third subject marks: ");
		m3=sc.nextInt();
		
		if((m1>60) && (m2>60) && (m3>60))
		{
			System.out.println("Result is: Passed");
		}
		else if((m1>60 && m2>60)||(m2>60 && m3>60)||(m1>60 && m3>60))
		{
			System.out.println("Result is: Promoted");
		}
		else
		{
			System.out.println("Result is: Failed");
		}
	}
}


