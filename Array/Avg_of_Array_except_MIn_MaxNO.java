public class Array2Qbank
{
	public static void main(String args[])
	{
	int Q[]={12,13,14,15,17,19};

	int max=0,min=0,sum=0,avg,p=0,len=0,j=0;;
	for(int i=0;i<Q.length;i++)
	{	
	sum=sum+Q[i];
	if(i==0)
	{
	max=Q[i];
	}
	else if(Q[i]>max)
	{
	max=Q[i];
	}
	}
	System.out.println("maximum no is:"+max);
	
	for(int i=0;i<Q.length;i++)
	{
	if(i==0)
	{
	min=Q[i];
	}
	else if(Q[i]<min)
	{
	min=Q[i];
	}
	
	}
	for(int i=0;i<Q.length;i++)
	{
	if(Q[i]==max || Q[i]==min)
	{
	continue;
	}
	else
	{
	Q[j]=Q[i];
	j++;
	}
	}
	System.out.println("minimum no is :"+min);
	System.out.println("Remaining elements:"+j);
	sum=sum-max-min;
	System.out.println("sum of other no :"+sum);
	System.out.println("Length of array :"+Q.length);
	
	p=Q.length;
	len=p-2;
	avg=sum/len;
	System.out.println("average is :"+avg);
}
}