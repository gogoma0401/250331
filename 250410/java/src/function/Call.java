package function;

public class Call {
	static void test1(int b) {
		System.out.println(b);
	}
	static void test2(int[] numbers) {
		for(int num : numbers) {
			System.out.println(num + "");
		}
	}
	public static void main(String[] args) {
		int a = 10;
		test1(a);
		int [] arr = {10,20,30,40,50};
		test2(arr);
	}
	
}
