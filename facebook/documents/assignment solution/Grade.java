class Grade
{
	public static void main(String arg[])
	{
		String a = arg[0];
		int i=Integer.parseInt(a);
		if(i>=60)
		{
			System.out.println("First Division");
		}
		else
		{
			 if(i<60 && i>=45)
			{
				System.out.println("Second Division");
			}

			else
			{
				 if(i<45 && i>=33)
				{
					System.out.println("Third Division");
				}
				else
				{
					System.out.println("Failed");
				}
			}
		}
	
	

}
}