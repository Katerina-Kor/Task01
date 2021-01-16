// Вычислить значение функции.

package by.htp.les03.main;

public class Task9 {

	public static void main(String[] args) {
		double x = 5;
		double F;

		if (x <= 3) {
			F = x * x - 3 * x + 9;
		} else {
			F = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.println(F);
	}

}
