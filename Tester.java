import java.util.Arrays;

public class Tester {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {5, 7, -20, 11, 44};
		System.out.println(ArrayOps.sum(a) == 15);
		System.out.println(ArrayOps.sum(b) == 47);
		System.out.println(ArrayOps.largest(a) == 5);
		System.out.println(ArrayOps.largest(b) == 44);

		int[][] matrix = {
			{1, 2, 3, 4, 5},
			{7, 0, 3},
			{-444, -3456, 8578},
			{9, 3, 4, 2, 2, 45, 6, 23, 4}
		};
		System.out.println(Arrays.toString(ArrayOps.sumRows(matrix)));
		System.out.println("should be [15, 10, 4678, 98]");
		System.out.println(Arrays.toString(ArrayOps.largestInRows(matrix)));
		System.out.println("should be [5, 7, 8578, 45]");
		System.out.println(ArrayOps.sum(matrix) == 4801);
		int[][] rectMatrix = {
			{1, 2, 3, 4, 5},
			{-1, -2, -3, -4, -5},
			{-6, -7, -8, -9, -10},
			{11, 44, 22, 66, 90}
		};
		System.out.println(Arrays.toString(ArrayOps.sumCols(rectMatrix)));
		System.out.println("should be [5, 37, 14, 57, 80]");
		int[][] rowMagic = {
			{1,2,3,4},
			{2,3,4,1},
			{3,4,1,2}
		};
		int[][] colMagic = {
			{1,1,1},
			{2,2,2},
			{3,3,3}
		};
		int[][] bothMagic = {
			{2,2,2},
			{2,2,2}
		};
		System.out.println(ArrayOps.isRowMagic(rowMagic));
		System.out.println(!ArrayOps.isRowMagic(rectMatrix));
		System.out.println(!ArrayOps.isRowMagic(colMagic));
		System.out.println(ArrayOps.isRowMagic(bothMagic));

		System.out.println(!ArrayOps.isColMagic(rowMagic));
		System.out.println(!ArrayOps.isColMagic(rectMatrix));
		System.out.println(ArrayOps.isColMagic(colMagic));
		System.out.println(ArrayOps.isColMagic(bothMagic));

		int[][] E = {
			{2,4,2},
			{2,2,2}
		};
		System.out.println(!ArrayOps.isLocationMagic(E, 0, 1));
		System.out.println(ArrayOps.isLocationMagic(E, 1, 1));
	}
}
