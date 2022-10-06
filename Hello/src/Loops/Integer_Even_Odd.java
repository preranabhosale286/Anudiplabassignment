package Loops;
import java.util.Scanner;
public class Integer_Even_Odd {
	public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
int x=obj.nextInt();
if(0<x && x<10)
{
int fx=x+2;
System.out.println(fx);
}
else if(x>=10)
{
	int fx=x*x+2;
	System.out.println(fx);
}
} 
}
