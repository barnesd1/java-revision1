package col;

import java.util.ArrayList;

public class Collections {
	Collections() {}
	public int[] AddToArray() {
		int[] Ary = new int[100];
		for(int i=0;i<100;i++) {
			Ary[i] = i+1;
		}
		return Ary;
	}
	
	public ArrayList<Integer> AddToList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=100; i<1000; i++) {
			list.add(i);
		}
		return list;
	}
	
	public ArrayList<Integer> ByTen(ArrayList<Integer> l2) {
		for(int i=100; i<1000; i++) {
			l2.set(i-100, l2.get(i-100)*10);
		}
		return l2;
	}
}
