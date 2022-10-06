package Loops;
import java.util.Scanner;
public class Leap {
public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
System.out.println("Enter year");
int num=obj.nextInt();
if(num%4==0)
{
System.out.println("it is a leap year");
}
else
{
System.out.println("not a leap year");
}
}
}
