package fotis.mmtf.entities;

import java.util.Collections;

/**
 * Class modeling a maven module object.
 */
public class MavenModule {

	/** Module name */
	String name;

	/** Module depth */
	Integer depth;

	/**
	 * Creates a new MavenModule object.
	 *
	 * @param name
	 * @param depth
	 */
	public MavenModule(String name, Integer depth) {
		this.name = name;
		this.depth = depth;
	}
	
	@SuppressWarnings("nls")
	@Override
	public String toString() {
		return String.join("", Collections.nCopies(depth, "  >")) + " " + name;
	}

	/**
	 * Gets the name.
	 *
	 * @return Returns the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the depth.
	 *
	 * @return Returns the depth
	 */
	public Integer getDepth() {
		return depth;
	}

}
