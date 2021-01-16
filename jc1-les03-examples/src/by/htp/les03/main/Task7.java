// ѕодсчитать количество отрицательных среди чисел a, b,c.

package by.htp.les03.main;

public class Task7 {

	public static void main(String[] args) {
		int a = 0;
		int b = -1;
		int c = -5;

		int x = 0;

		if (a < 0) {
			x++;
		}

		if (b < 0) {
			x++;
		}

		if (c < 0) {
			x++;
		}

		System.out.println("ќтрицательных чисел: " + x);
	}

}
