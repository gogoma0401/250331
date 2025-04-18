package test;

class Animal {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Animal implements Predator, Barkable {
	public String getFood() {
		return "apple";
	}
	public void bark() {
		System.out.println("어흥");
	}
}

class Lion extends Animal implements Predator, Barkable {
	public String getFood() {
		return "banana";
	}
	public void bark() {
		System.out.println("으르렁");
	}
	
}



class ZooKeeper {
    void feed(Predator predator) { 
        System.out.println("feed" + predator.getFood());
    }
}
class Bouncer{
	void barkAnimal(Barkable animal) {
		animal.bark();
	}
}


public class Sample {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}