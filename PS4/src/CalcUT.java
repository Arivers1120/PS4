import junit.framework.TestCase;

import org.junit.Test;


public class CalcUT extends TestCase {

	
	@Test
	public void testFutureValue() {
		
		Calc test = new Calc();
		
		assertEquals("Future Amount is : $2121.0",2121.0,test.FutureValue(2000, 2, 3));
		assertEquals("Future Amount is : $600.0",600.00,test.FutureValue(400, 6, 7));}
}