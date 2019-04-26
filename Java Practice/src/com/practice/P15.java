package com.practice;

import java.util.Scanner;

public class P15 {
public static void main(String []arg) {
	//word count of sentance
	Scanner sc=new Scanner(System.in);
	int count=0;
	
	System.out.println("enter sentance ");
	String s=sc.nextLine();
	
	char ch[]=new char[s.length()];
	
	 for(int i=0;i<s.length();i++)  
     {  
         ch[i]= s.charAt(i);  
         if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
             count++;  
     }   
	System.out.println("No of words are "+count);
}
}

//enter sentance 
//dev      hd
//No of words are 2