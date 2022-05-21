package com.java;

import java.util.Scanner;

public class Login 
{

	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		String username = "Lucky";
		String password = "ABC";
		String uname,pwd;
		int i=1;
        while(i>0) {
        	System.out.println("username:");
        	uname = sc.next();
        	
        	System.out.println("password:");
        	pwd = sc.next();
        	
        	if(username.equals(uname) && password.equals(pwd))
        	 {
        		System.out.println("Welcome " +uname);
        		break;
        	 }
        	else
        	 {
        		System.out.println("username and password are wrong!Re-enter");
        		i++;
        	 }
        	if(i>3) 
			 {
        		System.out.println("Contact Admin");
        		break;
        	 }
        }
	}
}

