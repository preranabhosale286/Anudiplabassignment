package Prerana;

import java.util.Scanner;

public class Area_of_Triangle {



	public static void main(String[] args) 
	{
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter the value of h");
			System.out.println("Enter the value of b");
			
			int h = obj.nextInt();
			int b = obj.nextInt();
			int area = h*b/2;
			System.out.println("Area of triangle = "+ area);

	}

}