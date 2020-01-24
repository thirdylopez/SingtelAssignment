package coding.model;

import coding.constants.LanguageConstants;

public class Rooster extends Chicken {
	
	@Override
	public void sound() {
		System.out.println("Cock-a-doodle-doo");
	}
	
	private void sound(String language) {
		
		String sound = LanguageConstants.ROOSTERSOUNDS.get(language);
		if(sound!=null) {
			System.out.println(sound);
		}else {
			sound();
		}
	}
}
