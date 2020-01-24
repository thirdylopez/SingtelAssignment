package coding.model;

import coding.model.capability.SwimCapability;

public class Duck extends Bird{
	
	private SwimCapability swimCapability;
	
	public Duck() {
		setSwimCapability(new SwimCapability());
		incSwimCount();
	}
	@Override
	public void sound() {
		System.out.println("Quack Quack");
	}


	public SwimCapability getSwimCapability() {
		return swimCapability;
	}


	public void setSwimCapability(SwimCapability swimCapability) {
		this.swimCapability = swimCapability;
	}


}
