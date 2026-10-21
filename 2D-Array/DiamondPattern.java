public class NestedLoop2
{
	public static void main(String args[])
	{
	int r,c,sp,k=1,p;
	for(r=1;r<=5;r++)
	{
	for(sp=1;sp<=5-r;sp++)
	{
	System.out.print("  ");
	}
	
	for(c=1;c<=1;c++)
	{
	System.out.print(k+" ");
	}
	if(r==1)
	{
	k++;
	System.out.print("\n");

	continue;
	}
	for(sp=1;sp<=2*r-3;sp++)
	{
	System.out.print("  ");
	}
	for(c=1;c<=1;c++)
	{
	System.out.print(k+" ");
	}
	k++;
	
	System.out.print("\n");
	}
	p=4;
	for(r=1;r<5;r++)
	{
	for(sp=1;sp<=r;sp++)
	{
	System.out.print("  ");
	}
	
	for(c=1;c<=1;c++)
	{
	System.out.print(p+" ");
	}
	if(r==4)
	{
	p--;
	System.out.print("\n");

	continue;
	}
	for(sp=1;sp<=7-2*r;sp++)
	{
	System.out.print("  ");
	}
	for(c=1;c<=1;c++)
	{
	System.out.print(p+" ");
	}
	p--;
	
	System.out.print("\n");
	}

}
}