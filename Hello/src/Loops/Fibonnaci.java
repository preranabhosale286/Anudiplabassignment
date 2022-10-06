package Loops;

public class Fibonnaci {
public static void main(String[] args) {
	int n=10;
	int a0=0,a1=1,a2=2;
	System.out.print(a0+" "+a1+" ");
	for(int i=3;i<10;i++)
	{
		a2=a0+a1;
		System.out.print(a2+" ");
		a0=a1;
		a1=a2;
	}
}
}
