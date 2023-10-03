package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Datareading_from_file_byte_mode {

	public static void main(String[] args)throws Exception {
		File f1=new File("d:/happiestmind/first.txt");
		FileInputStream fread=new FileInputStream(f1);
		
		File f2=new File("d:/happiestmind/second.txt");
		FileOutputStream fwrite=new FileOutputStream(f2);
		
		int i=0;
		while(!((i=fread.read())==-1)) {
			System.out.println(i);
			fwrite.write(i);
		}
		fread.close();
		fwrite.close();
		

	}

}
