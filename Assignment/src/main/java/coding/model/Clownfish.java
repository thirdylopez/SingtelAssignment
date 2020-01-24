/**
 * 
 */
package coding.model;

/**
 * @author valeriano.e.lopez
 *
 */
public class Clownfish extends Fish {
	
	public Clownfish(){
		super.setColor("Colorful");
		super.setSize("Small");
	}
	
	public void joke() {
		System.out.println("I am making a joke");
	}

}
