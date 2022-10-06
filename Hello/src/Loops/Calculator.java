package Loops;
public class Calculator {
	public static void main(String[] args) {
		if(args[0].equals("+"))
		{
			int num1=Integer.parseInt(args[1]);
			int num2=Integer.parseInt(args[2]);
			System.out.println(num1+num2);
		}
		else if(args[0].equals("-"))
		{
			int num3=Integer.parseInt(args[3]);
			int num4=Integer.parseInt(args[4]);
			System.out.println(num3-num4);
		}
		else if(args[0].equals("*"))
		{
			int num5=Integer.parseInt(args[5]);
			int num6=Integer.parseInt(args[6]);
			System.out.println(num5*num6);
		}
		else if(args[0].equals("/"))
		{
			int num7=Integer.parseInt(args[7]);
			int num8=Integer.parseInt(args[8]);
			System.out.println(num7/num8);
		}
		else
		{
			System.out.println("wrong input");
		}
	}

}
