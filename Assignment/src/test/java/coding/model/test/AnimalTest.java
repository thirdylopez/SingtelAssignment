/**
 * 
 */
package coding.model.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import coding.model.Animal;

/**
 * @author valeriano.e.lopez
 *
 */
public class AnimalTest {
	
	private Animal animal;
	private int swimCount = 0;
	private int flyCount = 0;
	private int walkCount = 0;
	private int singCount = 0;
	
	@Test
	public void testCount() {
		singCount = Animal.getSingCount();
		flyCount = Animal.getFlyCount();
		swimCount = Animal.getSwimCount();
		walkCount = Animal.getWalkCount();
	}

}
