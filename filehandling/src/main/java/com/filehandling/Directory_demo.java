package com.filehandling;

import java.io.File;

public class Directory_demo {

	public static void main(String[] args) {
		File f=new File("d:/happiestmind");
		if(f.mkdir()) {
			System.out.println("Directory created");
		}
		else {
			System.out.println("could not create ");
		}

	}

}
