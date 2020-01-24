package coding.model;

import coding.model.capability.FlyingCapability;

public class Butterfly extends Animal {
	
	private FlyingCapability flyingCapability;
	
	public Butterfly() {
		setFlyingCapability(new FlyingCapability());
		incFlyCount();
	}

	public FlyingCapability getFlyingCapability() {
		return flyingCapability;
	}

	public void setFlyingCapability(FlyingCapability flyingCapability) {
		this.flyingCapability = flyingCapability;
	}

}
