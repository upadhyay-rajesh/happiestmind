import java.io.*;
class  arrayreader
{
	public static void main(String[] args) throws Exception
	{		String str="if (a==4) a=2;";
		char ch[]=str.toCharArray();
		CharArrayReader c=new CharArrayReader(ch);
		PushbackReader p=new PushbackReader(c);
		int i=0; 
		while ((i=p.read())!=-1)// ascii value of eof is -1
		{
			char c1=(char)i;
			switch(c1)
			{
				case '=': if ((c1=(char)p.read())=='=')//if char after = is =,ie. ==
									System.out.print(".EQ.");
								else 
									
									{	
										System.out.print("<----");// if char after = is NOT =,ie.=
										p.unread(c1);//UNREAD THE  CHAR READ,ie.2
									}
									break;
					default:System.out.print(c1);
			}			
		}
	
	}
}
