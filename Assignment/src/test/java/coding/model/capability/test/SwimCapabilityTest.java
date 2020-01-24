/**
 * 
 */
package coding.model.capability.test;

import org.junit.Test;

import coding.model.capability.SwimCapability;

/**
 * @author valeriano.e.lopez
 *
 */
public class SwimCapabilityTest {
	
	@Test
	public void testSwim() {
		SwimCapability swimTest = new SwimCapability();
		swimTest.swim();
	}

}
