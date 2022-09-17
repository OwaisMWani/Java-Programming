import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.useCalc();
	}
}

class Calculator{
	static Scanner scan=new Scanner(System.in);
	public void useCalc() {
	System.out.println("Welcome to the calculator!");
	System.out.println("\nChoose the operation that you want to perform: + - / *:");
	String s = scan.nextLine();
	System.out.println("Enter two numbers to perform the operation on:");
	double a = scan.nextDouble();
	double b = scan.nextDouble();
	scan.close();
	switch(s) {
		case "/":
			divideNum(a,b);
			break;
		case "+":
			addNum(a,b);
			break;
		case "-":
			subtractNum(a,b);
			break;
		case "*":
			multiplyNum(a,b);
			break;
		default:
			System.out.println("\nInvalid Operator!");
			break;
	}
		}
	public void addNum(double a, double b) {
		System.out.println(a+"+"+b+" = " + (a+b));
		}
	public void subtractNum(double a, double b) {
		System.out.println(a+"-"+b+" = "+ (a-b));
		}
	public void divideNum(double a, double b) {
		System.out.println(a+"/"+b+" = " + (a/b));
		}
	public void multiplyNum(double a, double b) {
		System.out.println(a+"*"+b+" = " + (a*b));
		}
}