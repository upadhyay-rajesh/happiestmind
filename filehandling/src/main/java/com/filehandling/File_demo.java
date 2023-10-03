package com.filehandling;

import java.io.File;
import java.io.IOException;

public class File_demo {

	public static void main(String[] args)throws IOException {
		File f=new  File("d:/happiestmind/first.txt");
		if(f.createNewFile()) {
			System.out.println("file created");
		}
		else {
			System.out.println("could not create");
		}

	}

}
