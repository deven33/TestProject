package com.practice;

import java.util.Scanner;

public class P12 {
//Circular left shift in Array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []arr=new int[5];
		System.out.println("Enter n Array Element: ");
		int n=sc.nextInt();
		System.out.println("enter Elements: ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter Number of position Shift: ");
		int m=sc.nextInt();
		
		for(int i=0;i<m;i++) {
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++) {  //length=5 0 1 2 3 4
				arr[j]=arr[j+1];
			}
			arr[n-1]=temp;
			
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
		
		
	}

}
//Enter n Array Element: 
//5
//enter Elements: 
//1
//2
//3
//4
//5
//Enter Number of position Shift: 
//2
//34512
