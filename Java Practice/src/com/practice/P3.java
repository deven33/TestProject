package com.practice;

import java.util.Scanner;
//Sum Of digit
public class P3 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter No: ");
	int no=sc.nextInt();
	int sum=0;
	while(no>0) {
		int n=no%10;
		no=no/10;
		System.out.println(no);
		sum=sum+n;
	}
	System.out.println("Sum is: "+sum);
		
}
}
