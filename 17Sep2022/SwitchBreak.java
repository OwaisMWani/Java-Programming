import java.util.Scanner;

public class SwitchBreak {
	@SuppressWarnings("unused") // Suppresses java warnings for the "unused" warning
	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		Scanner scan = new Scanner(System.in);
		int a =  scan.nextInt();
		scan.close();
		switch(a) {
			case 0:
				System.out.println("Zero!");
				break;
			case 1:
				System.out.println("One!");
				break;
			default:
				System.out.println("\nnumber<0 or number>1\n");
				break;
			}
		for (int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("i:"+i+"    j:"+j);
				break;
					}
		  		}
		}
	}

