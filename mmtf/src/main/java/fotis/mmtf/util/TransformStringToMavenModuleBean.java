package fotis.mmtf.util;

import java.io.File;

import fotis.mmtf.entities.MavenModule;

/**
 * Transforms a String to {@link MavenModule}
 */
public class TransformStringToMavenModuleBean {
	
	/** Hide Constructor */
	private TransformStringToMavenModuleBean () {
		// Empty
	}
	
	/**  
	 * @param mavenString 
	 * @return Transforms a String to {@link MavenModule}
	 */
	public static MavenModule transform(String mavenString) {
		String[] path = mavenString.split(File.separator);
		Integer depth = path.length-1;
		String name = path[path.length - 1];
		return new MavenModule(name, depth);
	}

}
