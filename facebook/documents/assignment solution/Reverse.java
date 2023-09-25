class Reverse
{
   public static void main(String arg[])
	 {
          String a=arg[0];
	  int j=1,k=1,l=0;
          int i=Integer.parseInt(a);
	while(i>0)
               {
		j=i%10;
                 
		  System.out.print(j);
                  i=i/10;
               }
           
}
}







































