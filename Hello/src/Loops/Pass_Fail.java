package Loops;
import java.util.Scanner;
public class Pass_Fail {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the marks");
int marks = sc.nextInt();
String result = (marks>=40)? "pass":"fail";
System.out.println(result);

		}
}
