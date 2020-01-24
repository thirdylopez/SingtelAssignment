package coding.model;

import coding.model.capability.WalkingCapability;

public abstract class LandAnimal extends Animal implements SoundingObject  {
	

	private WalkingCapability walkingCapability;
	
	public LandAnimal() {
		setWalkingCapability(new WalkingCapability());
		incWalkCount();
	}
	
	public abstract void sound();


	public WalkingCapability getWalkingCapability() {
		return walkingCapability;
	}



	public void setWalkingCapability(WalkingCapability walkingCapability) {
		this.walkingCapability = walkingCapability;
	}

}
