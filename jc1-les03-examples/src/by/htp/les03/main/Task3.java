/* Дана величина А, выражающая объем информации в байтах. 
Перевести А в более крупные единицы измерения информации. */

package by.htp.les03.main;

public class Task3 {

	public static void main(String[] args) {
		long a;
		a = 209684500000L;
		
		long KB;
		long MB;
		long GB;
		long TB;
		
		KB = a / 1024;
		MB = KB / 1024;
		GB = MB / 1024;
		TB = GB / 1024;
		
		System.out.println(a + "  áàéòîâ = " + KB + " êèëîáàéò");
		System.out.println(a + "  áàéòîâ = " + MB + " ìåãîáàéò");
		System.out.println(a + "  áàéòîâ = " + GB + " ãèãîáàéò");
		System.out.println(a + "  áàéòîâ = " + TB + " òåðàáàéò");

	}

}
