/**
 * 
 */
package coding.model.capability.test;

import org.junit.Test;

import coding.model.capability.WalkingCapability;

/**
 * @author valeriano.e.lopez
 *
 */
public class WalkingCapabilityTest {
	
	@Test
	public void testWalk() {
		WalkingCapability walkTest = new WalkingCapability();
		walkTest.walk();
	}

}
