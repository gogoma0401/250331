package abst;

public class FlyUse {
	public static void main(String[] args) {
		Flyer f1 = new Drone();
		f1.takeoff();
		f1.fly();
		f1.land();
		Flyer f2 = new Airplane();
		f2.takeoff();
		f2.fly();
		f2.land();
	}
}
