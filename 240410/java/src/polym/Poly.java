package polym;

public class Polym {
	class A{
		int n = 10;
		public void print() {
			System.out.println(n);
		}
	}
	class B extends A{
		@Override
		int n = 20;
		public void print() {
			System.out.println(n);
		}
	}
	
	public class Poly{
		public static void main(String[] args) {
			B b = new B();
			b.print();
			A a = new B();
			System.out.println(a.n);
			a.print();
		}
		
	}
}
