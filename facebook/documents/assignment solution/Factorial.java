class Factorial
{
   public static void main(String arg[])
	{
         String a=arg[0];
          int fact=Integer.parseInt(a);
int i,j=1 ;           
for(i=2;i<=fact;i++)
{
j=j*i;

}

         System.out.println(j);
	}
}