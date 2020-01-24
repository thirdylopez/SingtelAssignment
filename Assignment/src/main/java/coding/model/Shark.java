package coding.model;

public class Shark extends Fish {
	
	public Shark(){
		super.setColor("Grey");
		super.setSize("Large");
	}
	
	public void eat() {
		System.out.println("I am eating another fish");
	}

}
