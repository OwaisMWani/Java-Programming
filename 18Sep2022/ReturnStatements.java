import java.util.Scanner;

public class ReturnStatements {
	public static void main(String[] args) {
		System.out.println("Type two numbers you want to add:");
		Scanner scan=new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println();
		double c = addNum(a,b); //Storing the value returned by addNum method in c
		System.out.println("e = " + c);
		System.out.println();
		System.out.println("Enter 3 integers to add into an array:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		scan.close();
		int[] array = arrayFromInt(x,y,z);//x,y,z are used as method parameters and stored into an array
		System.out.println();
		System.out.println("["+array[0]+"] ["+array[1]+"] ["+array[2]+"]");
		System.out.println();
		String s = exclaim("Our java program worked, and the return values are correct");//the return value of exclaim method is used on a string
		System.out.println(s);
	}
	public static double addNum(double a, double b){
		System.out.println(a + "+" + b + " = "+ (a+b));
		return a+b; //returns a+b in double data type form
	}
	public static int[] arrayFromInt(int a, int b, int c){
		int [] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;//returning the array with the input(method's parameters) a,b,c
	}
	public static String exclaim(String s){
		return s.toUpperCase()+"!"; //returns the given input in uppercase form along with an !
	}
}


