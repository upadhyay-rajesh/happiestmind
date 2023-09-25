class Prime
{
   public static void main(String arg[])
	{
         String a=arg[0];
          int i=Integer.parseInt(a);
           int j=2;
             int k;
              k=(i/2);
           
                while(j<k)
		{
                   if(i%j==0)  
		        {
                        System.out.println("Number is not Prime");
                         break;
			}
			j++;
             	}
               if(j==k)
{
                 System.out.println("Number is  Prime");
}
	}
}