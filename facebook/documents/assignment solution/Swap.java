class Swap
{
   public static void main(String arg[])
	{
         String a=arg[0];
          int i=Integer.parseInt(a);
        String b=arg[1];
int j=Integer.parseInt(b);
i=i+j;
j=i-j;
i=i-j;
System.out.println(i);
System.out.println(j);
}
}