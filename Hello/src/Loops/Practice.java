package Loops;
public class Practice {
public static void main(String args[]) {
System.out.println(args.length);
if (args[0].equals("+")) {
int b= Integer.parseInt(args[1]);
int c= Integer.parseInt(args[2]);
System.out.println(b+c);
}
else if(args[0].equals("-")){
int b= Integer.parseInt(args[1]);
int c= Integer.parseInt(args[2]);
System.out.println(b-c);
}
else {
System.out.println("Wrong input");
}
}
}