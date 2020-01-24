package coding.model;

public class Chicken extends Bird {
	
	public Chicken() {
		setFlyingCapabilty(null);
		decFlyCount();
	}
	
	@Override
	public void sound() {
		System.out.println("Cluck Cluck");
	}
	
	public void fly() {
		System.out.println("Chicken Wings are clipped. I cannot fly.");
	}

}
