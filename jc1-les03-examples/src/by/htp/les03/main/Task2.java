// Вычислить значение выражения по формуле

package by.htp.les03.main;

public class Task2 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double d;

		double rez;

		a = 1;
		b = 2;
		c = 3;
		d = 4;
		
		if (c == 0 || d == 0) {
			System.out.println("Âû÷èñëåíèå íåâîçìîæíî");
			return;
		}

		rez = (a / c) * (b / d) - ((a * b - c) / (c * d));
		System.out.println(rez);

	}

}
