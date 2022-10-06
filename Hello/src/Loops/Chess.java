package Loops;
import java.util.Scanner;
public class Chess {
public static void main(String[] args) {
	Scanner obj= new Scanner(System.in);	
int num1= obj.nextInt();
String l= obj.next();
if ((num1==1|| num1==3||num1==5||num1==7)&&(l.charAt(0)=='A'||l.charAt(0)=='C'||l.charAt(0)=='E')||l.charAt(0)=='G')
{
    System.out.println("Black");
} else if (((num1==2|| num1==4||num1==6||num1==8)&&(l.charAt(0)=='B'||l.charAt(0)=='D'||l.charAt(0)=='F')||l.charAt(0)=='H')) {
    System.out.println("White");
}
else {
    System.out.println("invalid input");
}
}
}