/**
 * 
 */
package coding.constants;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author valeriano.e.lopez
 *
 */
public class LanguageConstants {
	
	public static final String DANISH = "Danish";
	public static final String DUTCH = "Dutch";
	public static final String FINNISH = "Finnish";
	public static final String FRENCH = "French";
	public static final String GERMAN = "German";
	public static final String GREEK = "Greek";
	public static final String HEBREW = "Hebrew";
	public static final String HUNGARIAN = "Hungarian";
	public static final String ITALIAN = "Italian";
	public static final String JAPANESE = "Japanese";
	public static final String PORTUGUESE = "Portuguese";
	public static final String RUSSIAN = "Russian";
	public static final String SWEDISH = "Swedish";
	public static final String TURKISH = "Turkish";
	public static final String URDU = "Urdu";
	
	public static final Map<String, String> ROOSTERSOUNDS = populateRoosterSounds();
	
	public static Map<String, String> populateRoosterSounds(){
		Map<String, String> roosterSounds = new ConcurrentHashMap<String, String>();
		roosterSounds.put(DANISH, "kykyliky");
		roosterSounds.put(DUTCH, "kukeleku");
		roosterSounds.put(FINNISH, "kukko kiekuu");
		roosterSounds.put(FRENCH, "cocorico");
		roosterSounds.put(GERMAN, "kikeriki");
		roosterSounds.put(GREEK, "kikiriki");
		roosterSounds.put(HEBREW, "coo-koo-ri-koo");
		roosterSounds.put(HUNGARIAN, "kukuriku");
		roosterSounds.put(ITALIAN, "chicchirichi");
		roosterSounds.put(JAPANESE, "ko-ke-kok-ko-o");
		roosterSounds.put(PORTUGUESE, "cucurucu");
		roosterSounds.put(RUSSIAN, "kukareku");
		roosterSounds.put(SWEDISH, "kuckeliku");
		roosterSounds.put(TURKISH, "kuk-kurri-kuuu");
		roosterSounds.put(URDU, "kuklooku");
		return roosterSounds;
	}
	
	public LanguageConstants() {}
	
}
