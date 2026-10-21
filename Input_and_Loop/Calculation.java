import java.util.*;
public class Calculation
{
	public static void main(String args[])
	{
	Scanner Q=new Scanner(System.in);
	int a,b,add,sub,mult,div;
	float per;
	System.out.print("enter a no");
	a=Q.nextInt();
	System.out.print("enter second no");
	b=Q.nextInt();
	add=a+b;
	sub=a-b;
	mult=a*b;
	div=a/b;
	per=a/b*100;
	System.out.println("Addition is : "+ add);
	System.out.println("subtraction is : "+ sub);
	System.out.println("multiplication is : "+ mult);
	System.out.println("Division is : "+ div);
	System.out.println("percentage is : "+per);
}
}