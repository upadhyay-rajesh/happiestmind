class arraycopy
{
    public static void main(String arg[])
     {
	int a[]={1,2,3,4,5};
	int b[]= a;	
	b[4]=15;             
                  System.out.println(a[2]);  
	int b1[]=new int[5];
	System.arraycopy(a,2,b,0,2);
	System.out.println("b0="+b[0]);  
	System.out.println("b1="+b[1]);  
	System.out.println("b2="+b[2]);  
	System.out.println("b4="+b[4]); 
          }

}