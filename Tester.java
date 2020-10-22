public class Tester {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {5, 7, -20, 11, 44};
		System.out.println(ArrayOps.sum(a) == 15);
		System.out.println(ArrayOps.sum(b) == 47);
		System.out.println(ArrayOps.largest(a) == 5);
		System.out.println(ArrayOps.largest(b) == 44);
	}
}
