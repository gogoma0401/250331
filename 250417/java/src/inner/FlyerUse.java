package inner;

public class FlyerUse {
	public static void main(String[] args) {
		Flyer f = new Flyer() {

			@Override
			public void takeOff() {
				// TODO Auto-generated method stub
				System.out.println("fly");
			}

			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("take off");
			}

			@Override
			public void land() {
				// TODO Auto-generated method stub
				System.out.println("land");
			}
			
		};
		f.takeOff();
		f.fly();
		f.land();
	}
}
