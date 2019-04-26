package com.practice;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter No: ");
		int no=sc.nextInt();
		System.out.println("Enter Power: ");
		int pow= sc.nextInt();
		int sol=1;
		for(int i=pow; i>0;i--) {
			sol=sol*no;
		}
		System.out.println(sol);
		
	}
}
