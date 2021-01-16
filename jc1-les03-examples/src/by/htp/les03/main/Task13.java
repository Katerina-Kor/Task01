/* Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного числа.
 */

package by.htp.les03.main;

public class Task13 {

	public static void main(String[] args) {
		int x;
		x = 5;
		int rez = 0;
		
		if (x < 1) {
			System.out.println("число не положительное");
		}
		
		for (int i = 1; i <= x; i++) {
			rez += i;
		}
		
		System.out.println(rez);
	}

}
