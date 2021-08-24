package hw;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
 
public class HelloWorldTest {

	@Test
	public void testHelloWorld( ) {
		WhatToPrint hw = new WhatToPrint();
		assertEquals(hw.Print("HelloWorld"),"HelloWorld");
	}
}
