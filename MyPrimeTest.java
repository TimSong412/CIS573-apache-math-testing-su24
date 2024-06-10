
import static org.junit.Assert.*;

import org.junit.Test;

public class MyPrimeTest {

	@Test
	public void test2() {
		assertEquals(2, MyPrime.nextPrime(1));
	}

	@Test
	public void testNlessThan0() {
		try {
			MyPrime.nextPrime(-1);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("Arguments to the function must not be negative.", e.getMessage());
		}
	}

	@Test
	public void test1() {
		assertEquals(1, MyPrime.nextPrime(1));
	}

	@Test
	public void testPrime() {
		assertEquals(3, MyPrime.nextPrime(3));
	}

	@Test
	public void testRem0Add1() {
		assertEquals(11, MyPrime.nextPrime(9));
	}


	@Test
	public void testRem1Add1() {
		assertEquals(29, MyPrime.nextPrime(25));
	}

	@Test
	public void testRem0Add2() {
		assertEquals(37, MyPrime.nextPrime(33));
	}

	
}
