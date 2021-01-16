/* Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
Определить, пройдет ли кирпич через отверстие. */

package by.htp.les03.main;

public class Task8 {

	public static void main(String[] args) {
		double A = 10;
		double B = 13;
		
		double x = 9;
		double y = 12;
		double z = 12;
		
		if ((A > x) && (B > y)) {
			System.out.println("+");
		}else if ((A > y) && (B > x)) {
			System.out.println("+");
		}else if ((A > x) && (B > z)) {
			System.out.println("+");
		}else if ((A > z) && (B > x)) {
			System.out.println("+");
		}else if ((A > y) && (B > z)) {
			System.out.println("+");
		}else if ((A > z) && (B > y)) {
			System.out.println("+");
		}else {
			System.out.println("-");
		}

	}

}
