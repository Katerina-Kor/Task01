// Вычислить значение выражения по формуле

package by.htp.les03.main;

public class Task {

	public static void main(String[] args) {

		double a = 8;
		double b = 10;
		double c = 25;

		double d;

		if (a == 0) {
			System.out.println("Вычисление невозможно");
			return;
		}

		d = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println(d);

	}

}
