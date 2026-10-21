public class NestedLoop4
{
	public static void main(String args[])
	{
	int r,c,sp,k=1,p=7,s,q=5,j=7,b=5,d=5,a;
	for(r=1;r<=4;r++)
	{
	
	k=1;
	
	for(c=1;c<=r;c++)
	{
	System.out.print(k);
	k++;
	}
	for(sp=1;sp<=7-2*r;sp++)
	{
	System.out.print(" ");
	}
	
	for(c=1;c<=r;c++)
	{
	if(p==4)
	{
	p++;
	continue;
	}
	System.out.print(p);
	p++;
	}
	j=j-1;
	p=j;
	
	System.out.print("\n");
	}
	
	for(r=1;r<=3;r++)
	{
	a=1;
	for(c=1;c<=4-r;c++)
	{
	System.out.print(a);
	a++;
	}
	for(sp=1;sp<=2*r-1;sp++)
	{
	System.out.print(" ");
	}
	for(c=1;c<=4-r;c++)
	{
	System.out.print(b);
	b++;
	}
	d=d+1;
	b=d;
	System.out.print("\n");
	}
	


	
}
}