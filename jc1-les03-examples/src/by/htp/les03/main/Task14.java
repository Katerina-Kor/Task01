// Требуется определить факториал числа, которое ввел пользователь.

package by.htp.les03.main;

public class Task14 {

	public static void main(String[] args) {
		int number = 6;
		int F = 1;
		
		if (number == 0) {
			F = 1;
		}else {
			for (int i = 1; i <= number; i++) {
				F *= i;
			}
		}
		System.out.println(F);

	}

}
