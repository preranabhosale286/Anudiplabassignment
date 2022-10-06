package Prerana;
import java.util.Scanner;
public class Postive_Negative {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the three number");
	int x= obj.nextInt();
	String Result = (x>0)?"Positive":"Negative";
	System.out.println(Result);
}
}
