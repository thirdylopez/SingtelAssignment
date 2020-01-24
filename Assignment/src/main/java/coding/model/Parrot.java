package coding.model;

public class Parrot extends Bird {
	
	SoundingObject nearbyObject;
	
	public Parrot(SoundingObject nearbyObject){
		this.nearbyObject = nearbyObject;
	}
	
	@Override
	public void sound() {
		nearbyObject.sound();
	}

}
