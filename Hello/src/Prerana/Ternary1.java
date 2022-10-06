package Prerana;
import java.util.Scanner;
public class Ternary1 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int greater_number=(a>b)?((a>c)?a:c):((b>a)?b:c);
		System.out.println("Greater number is:"+ greater_number);
	}
}
