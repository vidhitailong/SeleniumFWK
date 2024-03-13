package Assignment_Saturday;

public class Even_Count_MP2 {
	public static void main(String[] args) {
		double[] a = { 24.5, 4.66, 44.22, 35.46, 74.567, 2.4, 5.3267 };
		arrayEven(a);

	}

	static void arrayEven(double[] a) {
		double count = 0;

		for (int i = 0; i <= a.length - 1; i++) {

			//if ((a[i] % 2.0 )== 0.0) {
				count++;
				System.out.println(a[i]);
			//}

		}
		System.out.println(count);

	}
}
