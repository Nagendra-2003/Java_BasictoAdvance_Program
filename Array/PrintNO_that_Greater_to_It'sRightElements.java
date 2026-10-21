import  javax.swing.*;
public class Array4Qbank
{
	public static void main(String args[])
	{
	int Q[]=new int[7];
	int flag=1;
	for(int i=0;i<Q.length;i++)
	{
	Q[i]=Integer.parseInt(JOptionPane.showInputDialog("enter no"));
	}
	for(int i=0;i<Q.length;i++)
	{
	for(int j=i+1;j<Q.length;j++)
	{
	flag=1;
	if(Q[i]<Q[j] || Q[i]==Q[j])
	{
	flag=0;
	break;
	}
	}
	if(flag==1)
	{
	System.out.println(Q[i]);
	}
	}
}
}
