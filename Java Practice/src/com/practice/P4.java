package com.practice;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter No: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
//enter No: 
//5
//1
//22
//333
//4444
//55555