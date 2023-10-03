package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Bufferedinput_demo {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your data");
		String str=br.readLine();
		
		File f1=new File("d:/happiestmind/third.txt");
		FileOutputStream fwrite=new FileOutputStream(f1);
		
		for(int i=0;i<str.length();i++) {
			fwrite.write(str.charAt(i));
		}
		
		
		
		System.out.println("you have entered "+str);
		
		fwrite.close();

	}

}
