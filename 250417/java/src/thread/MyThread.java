package thread;

public class MyThread  extends Thread{
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println(Thread.currentThread().getName() + " ==>" +1);
			try {
			Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}	
}
