package Prerana;


import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter value of c");
		int c = obj.nextInt();
		double f = c*1.8+32;
		System.out.println("Temperature = " + f);
		
	}

}