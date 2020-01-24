/**
 * 
 */
package coding.model;

/**
 * @author valeriano.e.lopez
 *
 */
public class Catterpillar extends Animal {
	
	public Catterpillar() {
		incWalkCount();
	}
	
	public void walk() {
		System.out.println("I am crawling");
	}

}
