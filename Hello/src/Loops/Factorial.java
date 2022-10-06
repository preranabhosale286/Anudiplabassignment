package Loops;
import java.util.Scanner;
public class Factorial {
static int factorial(int n)
{
int res = 1, i;
for (i=1; i<=n; i++)
res *= i;
return res;
}
public static void main(String[] args)
{
Scanner res = new Scanner(System.in);
System.out.println("enter the value :");
int num = res.nextInt();
System.out.println("Factorial of "+ num + " is " + factorial(num));
}
}

