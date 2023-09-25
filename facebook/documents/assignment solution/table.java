class table
{
	public static void main(String arg[])
	{
		
		int b=arg.length;
		int i,j=0;
		for(i=0;i<b;i++)
		{
			j+=Integer.parseInt(arg[i]);

			
		}
		System.out.println("average= "+(float)j/b);

		
	}
}


