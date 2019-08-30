package java.fileioapi.files.stream;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class StreamDemo {

	public static void main(String[] args) {
		IntStream stream = IntStream.of(2,4,6,1,34,26);
		IntPredicate pre = d->d>2;
		System.out.println(stream.anyMatch(pre));
	}
}
