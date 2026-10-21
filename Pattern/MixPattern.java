public class NestedLoop3
{
	public static void main(String args[])
	{
	int r,p,a=0,b=1,c=1;
	for(r=1;r<=5;r++)
	{
	for(p=1;p<=r;p++)
	{
	if(r==1)
	{
	System.out.print(c+" ");
	
	continue;
	}
	c=a+b;
	a=b;
	b=c;
	
	System.out.print(c+" ");
	}
	System.out.print("\n");
	}
}

}