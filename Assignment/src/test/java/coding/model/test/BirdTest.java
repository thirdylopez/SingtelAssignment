package coding.model.test;

import org.junit.Test;

import coding.model.Bird;
import coding.model.capability.FlyingCapability;
import coding.model.capability.SingingCapability;

public class BirdTest {
	
	private Bird bird = new Bird(); 
	
	@Test
	public void testSing() {
		SingingCapability singTest = new SingingCapability();
		bird.setSingingCapability(singTest);
		bird.getSingingCapability().sing();
	}
	
	@Test
	public void testSound() {
		bird.sound();
	}
	
	@Test
	public void testFlyingCapability() {
		bird.setFlyingCapabilty(new FlyingCapability());
		bird.getFlyingCapabilty().fly();
	}

}
