
public class A_WhileLoops {
	public static void main(String[] args) {
	 double a = 3;	
		while(a<100){
			System.out.println("a is less than 100!: "+a);
			a += 1;
		}
		while(a>=100&&a<4999) {
			System.out.println("a is more than 100 and less than 5000: "+a);
			a += 1;
		}
		do {
			System.out.println("this only prints once!");
		}while(a==1);
	}
}
