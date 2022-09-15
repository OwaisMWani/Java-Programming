import java.util.*;

public class E_IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your marks:");
		int a = scan.nextInt();
		if(a<25) {
			System.out.println("Your grade is F");
			System.out.println("Sorry, you have failed!");
		}
		if(a>=25 && a<35) {
			System.out.println("Your grade is D");
			System.out.println("Sorry, you have failed!");
		}
		if(a>=35 && a<50) {
			System.out.println("Your grade is C");
			System.out.println("Congratulations, you have passed!");
		}
		if(a>=50 && a<70) {
			System.out.println("Your grade is B");
			System.out.println("Congratulations, you have passed!");
		}
		if(a>=70 && a<=85) {
			System.out.println("Your grade is A");
			System.out.println("Congratulations, you have passed!");
		}
		if(a>=85 && a<=100) {
			System.out.println("Your grade is A+");
			System.out.println("Outstanding, you have passed with the top grade!");
		}
	}

}
