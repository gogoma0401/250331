package except;

public class ThrowsEx {
	public static void main(String[] args) {
		for (int i =10; i>=1; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
