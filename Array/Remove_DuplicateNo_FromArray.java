public class Array3Qbank
{
	public static void main(String args[])
	{
	int Q[]={20,20,30,40,50,50,50};
	int i,j,len=0,p=0,flag=1,R=0,m=0;

	for(i=0;i<Q.length;i++)
	{
	m=Q.length-1;
	for(j=i+1;j<Q.length;j++)
	{
	flag=1;
	if(Q[i]==Q[j])
	{
	len++;
	flag=0;
	break;
	}
	}
	if(flag==1 || i==m)
	{
	Q[p]=Q[i];
	p++;
	}
	}
	R=Q.length-len;
	for(p=0;p<R;p++)
	{
	System.out.println(Q[p]);
	}
	System.out.println(R);
}
}