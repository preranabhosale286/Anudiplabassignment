package Loops;
import java.util.Scanner;
public class Student_Marks {
public static void main(String[] args) {
int marks[] = new int[6];
int i;
float total=0, avg;
Scanner obj= new Scanner(System.in);


for(i=0; i<6; i++) { 
   System.out.print("Enter Marks of Subject"+(i+1)+":");
   marks[i] = obj.nextInt();
   total = total + marks[i];
}
obj.close();
//Calculating average here
avg = total/6;
System.out.print("The student Grade is: ");
if(avg>=80)
{
    System.out.print("A");
}
else if(avg>=60 && avg<80)
{
   System.out.print("B");
} 
else if(avg>=40 && avg<60)
{
    System.out.print("C");
}
else
{
    System.out.print("D");
}
}
}



