// Найти НОД двух целых положительных чисел.

package by.htp.les03.main;

public class Task15 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		int nod;
		
		if (a < b) {
			nod = a;
		}else {
			nod = b;
		}
		
		while (!((a % nod == 0) && (b % nod == 0))) {
			nod--;
		}
		
		System.out.println(nod);
	}

}
