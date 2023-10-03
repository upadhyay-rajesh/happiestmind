package com.filehandling;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessfile_Demo {

	public static void main(String[] args)throws Exception {
		File f=new File("d:/happiestmind/fifth.txt");
		
		RandomAccessFile rf=new RandomAccessFile(f, "rw");
		rf.writeChars("I am Happiestmind employee!");
		rf.close();

	}

}
