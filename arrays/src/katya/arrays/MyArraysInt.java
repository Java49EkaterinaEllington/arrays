package katya.arrays;

import java.util.Arrays;

public class MyArraysInt 
{
	
	public static int[] addNumber(int[] array, int num) {
		int[] arrCopy = Arrays.copyOf(array, array.length + 1);
		arrCopy[array.length] = num;
		return arrCopy;
	}

	public static int[] removeNumber(int[] array, int index) {
//		int[] arrDest = Arrays.copyOf(array, array.length - 1);
//   	System.arraycopy(array, index + 1, arrDest, index, array.length - index - 1);
		int[] arrDest = new int[array.length - 1];
		if (index > array.length || index < 0) {
			return array;
		} else {
			System.arraycopy(array, 0, arrDest, 0, index);
			System.arraycopy(array, index + 1, arrDest, index, array.length - index - 1);
		}
		return arrDest;
	}

	public static int[] insertNumber(int[] array, int index, int num) {
		int[] arrayDest = new int[array.length + 1];
		if (index > array.length || index < 0) {
			return array;
		} else {
			System.arraycopy(array, 0, arrayDest, 0, index);
			arrayDest[index] = num;
			System.arraycopy(array, index, arrayDest, index + 1, array.length - index);
		}
		return arrayDest;
	}
}
