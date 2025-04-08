package function;

public class Overload {
	public static void main(String[] args) {
		print(10);
		print(100.5);
		print("java");
	}
	static void print(int i) {
		System.out.println(i);
	}
	static void print(double j) {
		System.out.println(j);
	}
	static void print(String str) {
		System.out.println(str);
	}
}
