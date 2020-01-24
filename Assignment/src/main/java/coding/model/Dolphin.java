/**
 * 
 */
package coding.model;

import coding.model.capability.SwimCapability;

/**
 * @author valeriano.e.lopez
 *
 */
public class Dolphin extends Animal {
	
	
	private SwimCapability swimCapability;
	
	public Dolphin() {
		setSwimCapability(new SwimCapability());
		incSwimCount();
	}
	
	public SwimCapability getSwimCapability() {
		return swimCapability;
	}

	public void setSwimCapability(SwimCapability swimCapability) {
		this.swimCapability = swimCapability;
	}

}
