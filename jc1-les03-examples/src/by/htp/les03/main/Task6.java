/* Даны два угла треугольника (в градусах).
Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным. */

package by.htp.les03.main;

public class Task6 {

	public static void main(String[] args) {
		int a = 80;
		int b = 10;

		int c;
		c = 180 - (a + b);

		if (a + b >= 180) {
			System.out.println("Треугольника не существует");
			return;
		} else if (c == 90) {
			System.out.println("Треугольник существует и он прямоугольный");
		} else {
			System.out.println("Треугольник существует");
		}
	}

}
