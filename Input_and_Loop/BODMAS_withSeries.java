public class Loop2
{
	public static void main(String args[])
	{
	int i=1,num=2,j=1,ans=1,sol=0;
	for(i=1;i<=5;i++)
	{
	ans=1;
	for(j=1;j<=(2*i-1);j++)
	{
	ans=ans*num;
	}
	
	
	if(i==1)
	{
	System.out.print(ans );
	System.out.print("-");
	
	}
	else
	{
	System.out.print(ans);
	System.out.print("+");
	

	}	
	if(i==2)
	{
	sol=sol-ans;
	}
	else
	{
	sol=sol+ans;
	}
	
	}
	System.out.print("\n the final answer of this eqn : "+sol);
	
}
}