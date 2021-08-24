package col;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collections col = new Collections();
		System.out.println(Arrays.toString(col.AddToArray()));
		System.out.println(col.AddToList());
		System.out.println(col.ByTen(col.AddToList()));
	}

}
