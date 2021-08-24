package str;

import java.util.Arrays;
import java.util.stream.*;


public class Runner {

	public static void main(String[] args) {
		Streams str = new Streams();
		IntStream stream = Arrays.stream(str.AddToArray());
		stream.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		str.AddToList().forEach(result -> System.out.print(result + " "));
		System.out.println();
		
		str.ByTen(str.AddToList()).forEach(result -> System.out.print(result + " "));
		System.out.println();
	}

}
