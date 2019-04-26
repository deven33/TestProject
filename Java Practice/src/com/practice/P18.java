package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class P18{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		File f=new File("A.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		System.out.println(f.getParent());
		FileInputStream fis=new FileInputStream("D:\\1.txt.txt");
		//char ch;
		while(fis.available()>0) {
			char ch=(char)fis.read();
			ch=(char) (ch-32);
			System.out.print((ch+" "));
		}
		//System.out.println(ch);
		}
		
		
	}



