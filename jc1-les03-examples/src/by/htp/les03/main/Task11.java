// Вычислить значение функции на отрезке [a,b] с шагом h.

package by.htp.les03.main;

public class Task11 {

	public static void main(String[] args) {
		double a = -5;
		double b = 5;
		double h = 0.5;
		
		double y;
		
		for (double x = a; x <= b; x += h) {
			if (x > 2) {
				y = x;
			}else {
				y = -x;
			}
			System.out.println("x = " + x + ", y = " + y);
		}

	}

}
