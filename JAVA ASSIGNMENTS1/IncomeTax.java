package com.java;

import java.util.Scanner;

public class IncomeTax 
{

	public static void main(String[] args) 
    {
		double tax=0,InTax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income ");
        InTax = sc.nextDouble();
        if(InTax<=180000)
        	tax = 0;
        
        else if(InTax<=300000)
        	tax = 0.1 * (InTax-180000);
        
        else if(InTax<=500000)
        	tax=(0.2*(InTax-300000))+(0.1*100000);
        
        else if(InTax<=1000000)
        	tax=(0.3*(InTax-500000))+(0.2*180000)+(0.1*100000);
        
        else
        	tax=(0.4*(InTax-1000000))+(0.3*500000)+(0.2*180000)+(0.1*100000);
        System.out.println("Income tax amount is "+tax);

	}

}
