public class Loop
{
	public static void main(String args[])
	{
	int i=1,num=10,j=1,ans=1;
	for(i=1;i<=5;i++)
	{
	ans=1;
	for(j=1;j<=i;j++)
	{
	ans=ans*num;
	}
	ans=ans-1;
	System.out.print(ans );
	System.out.print("+");

	}
}
}