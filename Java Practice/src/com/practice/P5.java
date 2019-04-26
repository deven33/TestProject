package com.practice;

import java.util.Scanner;

public class P5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter No: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
//enter No: 
//5
//1
//222
//33333
//4444444
//555555555