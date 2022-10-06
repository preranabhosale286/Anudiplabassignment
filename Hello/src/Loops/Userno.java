package Loops;
import java.util.Scanner;
public class Userno {
public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
System.out.println("Enter number");
int num=obj.nextInt();
if(num%2==0)
{
System.out.println("number is even");
}
else
{
System.out.println("number is odd");
}
}
}
