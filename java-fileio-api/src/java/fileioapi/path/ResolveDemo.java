package java.fileioapi.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveDemo {

	public static void main(String[] args) {
		Path origin = Paths.get("whizlabs/java");
		Path target = Paths.get("OCPJP8");
		System.out.println(origin.resolve(target));
		Path sibling = Paths.get("AWS");
		System.out.println(origin.resolveSibling(sibling));
	}
}
