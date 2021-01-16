/* Составить программу сравнения двух чисел a и b.
Если a меньше b - вывести на экран цифру 7, в противном случае - цифру 8. */

package by.htp.les03.main;

public class Task4 {

	public static void main(String[] args) {
		double a = 10;
		double b = 9;

		if (a < b) {
			System.out.println(7);
		} else if (a > b) {
			System.out.println(8);
		} else {
			System.out.println("Числа равны"); // доп условие при равенстве чисел
		}

	}

}
