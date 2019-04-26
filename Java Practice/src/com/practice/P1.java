package com.practice;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter No: ");
		int a= sc.nextInt();
		int fact=1;
	
//		for(int i=1;i<=a;i++){    
//		      fact=fact*i;    
//		  }  
//Recursion
		fact=fac(a);
		
		System.out.println(fact);
	}
	
	//Recursion
	static int fac(int n) {
		if (n==0) {
			return 1;
		}
	else {
		return(n*fac(n-1));
	}

}
}
