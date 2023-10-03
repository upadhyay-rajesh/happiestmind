package com.filehandling;

import java.util.StringTokenizer;

public class Stringtokenizer_demo {

	public static void main(String[] args)throws Exception {
		
		String str="hello how are you?";
		
		StringTokenizer st=new StringTokenizer(str, "e");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
