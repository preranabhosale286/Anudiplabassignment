package Loops;

public class Triangle {
public static void main(String[] args) {
	int a=120;
	int b=30;
	int c=30;
	if(a+b+c==180)
	{
		if (a<90 && b<90 && c<90)
		{
			System.out.println("actute angle:");
		}
		else if(a==90 || b==90 || c==90)
		{
			System.out.println("right angle");
		}
		else if(a > 90  || b > 90  ||  c > 90)
		{
			System.out.println("obtuse angle");
		}
	
	
	}
}
}
