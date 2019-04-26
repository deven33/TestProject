package com.practice;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int flag=0;
		System.out.println("Enter String ");
		String s=sc.nextLine();
		int m=s.length();
		for(int i=0;i<s.length()/2;i++,m--) {
			if(s.charAt(i)==s.charAt(m-1)) {
				flag=1;
			}
			else flag=0;
		}
		if(flag==1) {
			System.out.println("Palindrom");
		}
		else
			System.out.println("Not palindrom");
	}

}
