package coding.model;

import coding.model.capability.SwimCapability;

public class Fish extends Animal {
	
	private String size;
	private String color;
	private SwimCapability swimCapability;
	
	public Fish(){
		setSwimCapability(new SwimCapability());
		incSwimCount();
	}

	public SwimCapability getSwimCapability() {
		return swimCapability;
	}

	public void setSwimCapability(SwimCapability swimCapability) {
		this.swimCapability = swimCapability;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
