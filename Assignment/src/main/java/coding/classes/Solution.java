/**
 * 
 */
package coding.classes;

import coding.model.Animal;
import coding.model.Bird;
import coding.model.Butterfly;
import coding.model.Cat;
import coding.model.Chicken;
import coding.model.Clownfish;
import coding.model.Dog;
import coding.model.Dolphin;
import coding.model.Duck;
import coding.model.Fish;
import coding.model.Frog;
import coding.model.Parrot;
import coding.model.Rooster;
import coding.model.Shark;

/**
 * @author valeriano.e.lopez
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(new Dog()),
				new Fish(), new Shark(), new Clownfish(), new Dolphin(), new Frog(), new Butterfly(), new Cat() };

		System.out.println("Flying Animal Count: " + Animal.getFlyCount());
		System.out.println("Walking Animal Count: " + Animal.getWalkCount());
		System.out.println("Singing Animal Count: " + Animal.getSingCount());
		System.out.println("Swimming Animal Count: " + Animal.getSwimCount());

	}

}
