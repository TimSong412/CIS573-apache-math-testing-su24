
import static org.junit.Assert.*;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.fraction.Fraction;
import org.junit.Test;


public class MyFractionsTest {

	@Test(expected=NullArgumentException.class)
	public void testF1NullF2Null() {
		MyFractions.addSub(null, null, false);
	}

	// write test cases that cover all branches in the addSub method

	@Test
	public void testF1ZeroAdd() {
		Fraction f1 = new Fraction(0, 1);
		Fraction f2 = new Fraction(1, 1);
		Fraction result = MyFractions.addSub(f1, f2, true);
		assertEquals(f2, result);
	}

	@Test
	public void testF1ZeroSub() {
		Fraction f1 = new Fraction(0, 1);
		Fraction f2 = new Fraction(1, 1);
		Fraction result = MyFractions.addSub(f1, f2, false);
		assertEquals(f2.negate(), result);
	}

	@Test
	public void testF2ZeroAdd() {
		Fraction f1 = new Fraction(1, 1);
		Fraction f2 = new Fraction(0, 1);
		Fraction result = MyFractions.addSub(f1, f2, true);
		assertEquals(f1, result);
	}

	@Test
	public void testF2ZeroSub() {
		Fraction f1 = new Fraction(1, 1);
		Fraction f2 = new Fraction(0, 1);
		Fraction result = MyFractions.addSub(f1, f2, false);
		assertEquals(f1, result);
	}

	@Test
	public void testD1OneAdd() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(1, 3);
		Fraction result = MyFractions.addSub(f1, f2, true);
		assertEquals(new Fraction(5, 6), result);
	}

	@Test
	public void testD1OneSub() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(1, 3);
		Fraction result = MyFractions.addSub(f1, f2, false);
		assertEquals(new Fraction(1, 6), result);
	}

	@Test
	public void testD1NotOneTmod1NotZeroAdd() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(1, 4);
		Fraction result = MyFractions.addSub(f1, f2, true);
		assertEquals(new Fraction(3, 4), result);
	}

	@Test
	public void testD1NotOneTmod1NotZeroSub() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(1, 4);
		Fraction result = MyFractions.addSub(f1, f2, false);
		assertEquals(new Fraction(1, 4), result);
	}


	@Test
	public void testD1NotOneTmod1ZeroAdd() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(1, 6);
		Fraction result = MyFractions.addSub(f1, f2, true);
		assertEquals(new Fraction(2, 3), result);
	}

	@Test
	public void testD1NotOneTmod1ZeroSub() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(1, 6);
		Fraction result = MyFractions.addSub(f1, f2, false);
		assertEquals(new Fraction(1, 3), result);
	}

}
