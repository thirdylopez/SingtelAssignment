/**
 * 
 */
package coding.model;

/**
 * Master Class for all Animals
 * @author valeriano.e.lopez
 *
 */
public class Animal {
	
	private static int swimCount;
	private static int flyCount;
	private static int walkCount;
	private static int singCount;
	
	public static int getSwimCount() {
		return swimCount;
	}
	public static int getFlyCount() {
		return flyCount;
	}
	public static int getWalkCount() {
		return walkCount;
	}
	public static int getSingCount() {
		return singCount;
	}
	public static void incSwimCount() {
		Animal.swimCount ++;
	}
	public static void incFlyCount() {
		Animal.flyCount  ++;
	}
	public static void decFlyCount() {
		Animal.flyCount  --;
	}
	public static void incWalkCount() {
		Animal.walkCount  ++;
	}
	public static void incSingCount() {
		Animal.singCount  ++;
	}
	
	
	

}
