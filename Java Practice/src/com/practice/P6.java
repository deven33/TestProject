package com.practice;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for( int k=1; k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int t=i-1;t>=1 ;t--) {
				System.out.print(t);
			}
			System.out.println();
		}
	}

}
//Enter No: 
//5
//    1
//   121
//  12321
// 1234321
//123454321
