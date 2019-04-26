package com.practice;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int a= sc.nextInt();

		/* Important*/
		
		int m=a/2;
		int flag=0;
		if(a==0 || a==1) {
			System.out.println(a+" is not prime number");   
		}
		else {
			for(int i=2;i<=m;i++) {
				if(a%i==0) {
					System.out.println(a+" is not prime number"); 
					flag=1;
					break;
				}
			}
		}
		if (flag==0) {
			System.out.println(a+" is prime number"); 
		}
		
				
		

	}

}
