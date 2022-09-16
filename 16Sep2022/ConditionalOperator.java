
public class ConditionalOperator {
	public static void main(String[] args) {
		int a = 3>8 ? 4 : 2; // <condition> ? <value if true> : <value if false>
		System.out.println(a);
		String s = "hey";
		double result = s.equals("hey") ? 55 : 33; // <condition> ? <value if true> : <value if false>
		System.out.println(result);
	}
}
