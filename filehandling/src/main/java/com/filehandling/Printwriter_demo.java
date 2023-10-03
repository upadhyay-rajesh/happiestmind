package com.filehandling;

import java.io.File;
import java.io.PrintWriter;

public class Printwriter_demo {

	public static void main(String[] args) throws Exception{
		PrintWriter pw=new PrintWriter(new File("d:/happiestmind/fourth.html"));
		
		pw.println("<html><body>");
			pw.println("<p align=center><font color=red size=6><b>I am Happy</b></font></p>");
		pw.println("</body></html>");
		
		pw.close();

	}

}
