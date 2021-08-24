package it;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iteration ir = new Iteration();
		ir.PrintNumFromTo(1, 10);
		System.out.println("------");
		ir.PrintNumFromTo(100, 999);
		System.out.println("------");
		ir.PrintNumFromTo(1, 100);
		System.out.println("------");
		ir.PrintNumFromTo(1, 1000);
		System.out.println("------");
		ir.PrintOneToTenWords();
	}

}
