import static org.junit.Assert.*;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Test;


public class MySorterTest {

	@Test(expected=NullArgumentException.class)
	public void testNullInputs() {
		MySorter.sortInPlace(null, MySorter.OrderDirection.DECREASING, (double[])null);
	}

	@Test(expected=NullArgumentException.class)
	public void testNullyList() {
		MySorter.sortInPlace(new double[] {1, 2, 3}, MySorter.OrderDirection.DECREASING, (double[])null);
	}

	@Test(expected=DimensionMismatchException.class)
	public void testDifferentLengths() {
		MySorter.sortInPlace(new double[] {1, 2, 3}, MySorter.OrderDirection.DECREASING, new double[] {1, 2});
	}

	@Test
	public void testSortInPlace_IncreasingOrder() {
		double[] array = {3, 2, 1};
		double[] expected = {1, 2, 3};
		MySorter.sortInPlace(array, MySorter.OrderDirection.INCREASING);
		assertArrayEquals(expected, array, 0.0);
	}

	@Test
	public void testSortInPlace_DecreasingOrder() {
		double[] array = {2, 1, 3};
		double[] expected = {3, 2, 1};
		MySorter.sortInPlace(array, MySorter.OrderDirection.DECREASING);
		assertArrayEquals(expected, array, 0.0);
	}
	
	@Test
	public void testSortInPlace_YListIncreasing() {
		double[] array1 = {3, 2, 1};
		double[] array2 = {30, 20, 10};
		double[] expected1 = {1, 2, 3};
		double[] expected2 = {10, 20, 30};
		MySorter.sortInPlace(array1, MySorter.OrderDirection.INCREASING, array2);
		assertArrayEquals(expected1, array1, 0.0);
		assertArrayEquals(expected2, array2, 0.0);
	}

	@Test
	public void testSortInPlace_YListDecreasing() {
		double[] array1 = {3, 2, 1};
		double[] array2 = {30, 20, 10};
		double[] expected1 = {3, 2, 1};
		double[] expected2 = {30, 20, 10};
		MySorter.sortInPlace(array1, MySorter.OrderDirection.DECREASING, array2);
		assertArrayEquals(expected1, array1, 0.0);
		assertArrayEquals(expected2, array2, 0.0);
	}
	
}
