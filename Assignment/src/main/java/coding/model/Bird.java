package coding.model;

import coding.model.capability.FlyingCapability;
import coding.model.capability.SingingCapability;

public class Bird extends LandAnimal {
	
	private FlyingCapability flyingCapabilty;
	private SingingCapability singingCapability;
	
	public Bird(){
		setFlyingCapabilty(new FlyingCapability());
		incFlyCount();
		incSingCount();
	}
	
	@Override
	public void sound() {
		System.out.println("Tweet tweet");
	}
	
	public FlyingCapability getFlyingCapabilty() {
		return flyingCapabilty;
	}

	public void setFlyingCapabilty(FlyingCapability flyingCapabilty) {
		this.flyingCapabilty = flyingCapabilty;
	}

	public SingingCapability getSingingCapability() {
		return singingCapability;
	}

	public void setSingingCapability(SingingCapability singingCapability) {
		this.singingCapability = singingCapability;
	}
	
	
	
}
