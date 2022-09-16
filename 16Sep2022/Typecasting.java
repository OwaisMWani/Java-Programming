
public class Typecasting {
	public static void main(String[] args) {
		byte c = 9;
		int f = c; //typecasting byte to int
		double z = 6;
		int x = (int) z;// using (int) to typecast double z into int x
		byte a =(int) 0.9; //using (int) to typecast from byte to int
		System.out.println(a);
		System.out.println(x);
		System.out.println(f);
	}
}
