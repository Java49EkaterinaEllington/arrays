package katya.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static katya.arrays.MyArraysInt.*;

class MyArraysIntTests {

	@Test
	void testAddNumber() {
		int array[] = { 1, 2, 3 };
		int expected1[] = { 1, 2, 3, 4 };
		int expected2[] = { 1, 2, 3, 4, 10 };
		assertArrayEquals(expected1, addNumber(array, 4));
		assertArrayEquals(expected2, addNumber(expected1, 10));
	}

	@Test
	void testRemoveNumber() {
		int array[] = { 1, 2, 3, 4, 5 };
		int expected1[] = { 1, 2, 4, 5 };
		int expected2[] = { 2, 3, 4, 5 };
		assertArrayEquals(array, removeNumber(array, 6));
		assertArrayEquals(array, removeNumber(array, -1));
		assertArrayEquals(expected2, removeNumber(array, 0));
		assertArrayEquals(expected1, removeNumber(array, 2));
	}

	@Test
	void testInsertNumber() {
		int array[] = { 1, 2, 4, 5 };
		int expected1[] = { 1, 2, 3, 4, 5 };
		int expected2[] = { 1, 2, 4, 5, 6 };
		int expected3[] = { 0, 1, 2, 4, 5 };
		assertArrayEquals(expected1, insertNumber(array, 2, 3));
		assertArrayEquals(expected2, insertNumber(array, 3, 8));
		assertArrayEquals(expected3, insertNumber(array, 0, 0));
		assertArrayEquals(array, insertNumber(array, 9, 8));
		assertArrayEquals(array, insertNumber(array, -2, 0));
	}

	@Test
	void testBinarySearchInt() {
		int array[] = { 2, 3, 5, 1, 4 };
		int array1[] = { 1, 3, 2, 6, 5, 1, 3 };
		Arrays.sort(array);
//		Arrays.sort(array1);
		assertEquals(2, Arrays.binarySearch(array, 3));
		assertEquals(3, Arrays.binarySearch(array1, 2));
		assertEquals(-6, Arrays.binarySearch(array, 8));
		assertEquals(-1, Arrays.binarySearch(array, 0));
	}

	@Test
	void testCopyOf() {
		int array[] = { 1, 2, 3 };
		int expected1[] = { 1, 2, 3 };
		int expected2[] = { 1 };
		int expected3[] = { 1, 2, 3, 0, 0, 0 };
		assertArrayEquals(expected1, Arrays.copyOf(array, array.length));
		assertArrayEquals(expected2, Arrays.copyOf(array, 1));
		assertArrayEquals(expected3, Arrays.copyOf(array, 6));
	}

	@Test
	void testArraycopy() {
		int array[] = { 1, 2, 3 };
		int expected[] = { 10, 15, 1, 2, 10 };
		int arrayDest[] = new int[5];
		int array1[] = { 2, 5, 10 };
		System.arraycopy(array, 0, arrayDest, 2, 2);
		System.arraycopy(array1, 1, arrayDest, 0, 2);
		arrayDest[4] = 20;
		assertArrayEquals(expected, arrayDest);
	}

}

