// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII).

package by.htp.les03.main;

public class Task12 {

	public static void main(String[] args) {
		char ch;
		for (int i = 32; i <= 126; i++) {
			ch = (char) i;
			System.out.println(i + " - " + ch);
	        }

	        System.out.println();

	}

}
