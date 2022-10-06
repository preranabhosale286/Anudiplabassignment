package Loops;
import java.util.*;
public class Temp {
public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
int temp=obj.nextInt();
System.out.println("Enter temperature");
if(temp < 100)
{
	System.out.println("green light is on");
}

 else if(temp>100 && temp<200)
{
	System.out.println("yellow light is on");
}
 else if(temp>200)
	 System.out.println("red light is on");

}
}