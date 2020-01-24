package coding.model.capability.test;

import org.junit.Test;

import coding.model.capability.FlyingCapability;

public class FlyingCapabilityTest {
	
	@Test
	public void testFly() {
		FlyingCapability flyTest = new FlyingCapability();
		flyTest.fly();
	}

}
