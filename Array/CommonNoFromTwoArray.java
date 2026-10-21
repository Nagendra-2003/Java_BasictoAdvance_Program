public class Arr1
{
	public static void main(String args[])
	{
	int Q[]={10,11,12,13,21};
	int P[]={21,23,24,10,67};
	System.out.println("Data of Q :");
	for(int j=0;j<Q.length;j++)
	{
	for(int i=0;i<P.length;i++)
	{
	if(Q[j]==P[i])
	{
	System.out.println(Q[j]);
	}
	}
	}
}
}
