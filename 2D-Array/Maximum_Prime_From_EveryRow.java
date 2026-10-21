import  javax.swing.*;
public class Array5Qbank
{
	public static void main(String args[])
	{
	int Q[][]=new int[3][3];
	int flag=1,r,c,max=0,len=0;
	for(r=0;r<=2;r++)
	{
	for(c=0;c<=2;c++)
	{
	Q[r][c]=Integer.parseInt(JOptionPane.showInputDialog("enter no"));
	}
	}
	for(r=0;r<=2;r++)
	{
	max=0;
	len=0;
	for(c=0;c<=2;c++)
	{
	 for(int j=2;j<Q[r][c];j++)
	{	
	flag=1;
	if(Q[r][c]%2==0)
	{
	flag=0;
	break;
	}
	}
	if(flag==1)
	{
	len++;
	if(len==1)
	{
	max=Q[r][c];
	}
	else if(max>Q[r][c])
	{
	System.out.print(Q[r][c]+"\t");
	continue;
	}
	else if(max<Q[r][c])
	{
	max=Q[r][c];
	}
	}
	System.out.print(Q[r][c]+"\t");
	}
	System.out.print("\t ="+max);
	System.out.print("\n ");
	}
}
}