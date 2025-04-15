package polym;

public class Polym {
	class A {
		int n = 10;
		
		public void print() {
			System.out.println(n);
		}
	}
	class b extends A{
		int n = 20;

		@Override
		public void print() {
			super.print();
		}
		
		
	}
}
