package fotis.mmtf;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fotis.mmtf.entities.MavenModule;
import fotis.mmtf.util.TransformStringToMavenModuleBean;


/**
 * Main class.
 */
public class MavenModuleTreeFinder {

	/**
	 * @param args
	 * @throws IOException 
	 */
	@SuppressWarnings("nls")
	public static void main(String[] args) throws IOException {
		/**
		 * Set the project local path<br>
		 * ex. /home/myuser/aaa/bbb/Root
		 */
		final String rootPath = "Enter the path to your project parent Maven module";

		final String pomxml = "pom.xml";
		final String target = "target";
		System.out.println("Root");
		try (Stream<Path> paths = Files.walk(Paths.get(rootPath))) {
		    Set<MavenModule> pomPaths = paths
		        .filter(p -> p.toString().contains(pomxml))
		        .filter(p -> !(p.toString().contains(target)))
		        .map(Path::toString)
		        .map(s -> s.replace(pomxml, ""))
		        .sorted()
		        .map(s -> s.replace(rootPath, ""))
		        .filter(s -> !s.equals("/"))
		        .map(TransformStringToMavenModuleBean::transform)
		        .collect(Collectors.toCollection(LinkedHashSet::new));   
		    pomPaths.forEach(System.out::println);
		} 
	}

}
