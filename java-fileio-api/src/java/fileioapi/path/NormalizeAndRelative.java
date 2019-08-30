package java.fileioapi.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeAndRelative {

	public static void main(String[] args) {
		//7all occurrences of "." are considered redundant. 
		//If a ".." is preceded by a non-".." name then both names are considered redundan
		Path origin = Paths.get("whizlabs/../../oracle/./java/..");
		System.out.println(origin.getNameCount());
		System.out.println(origin.getParent());
		System.out.println(origin.getRoot());
		Path normalized = origin.normalize();
		System.out.println(normalized);
		Path target = Paths.get("whizlabs");
		System.out.println(origin.relativize(target));
		Path test = Paths.get("Test", "/2322/12");
		System.out.println(test.relativize(target));
		Path last = Paths.get("test");
		System.out.println(last.relativize(target));
	}
}
