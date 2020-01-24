/**
 * 
 */
package coding.model.capability.test;

import org.junit.Test;

import coding.model.capability.SingingCapability;

/**
 * @author valeriano.e.lopez
 *
 */
public class SingingCapabilityTest {
	
	@Test
	public void testSing() {
		SingingCapability singTest = new SingingCapability();
		singTest.sing();
	}

}
