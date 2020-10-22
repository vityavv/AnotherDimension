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
		System.out.println(ArrayOps.sum(matrix) == 4801);
	}
}
