/* �������� ���������, ��� ������������ ������ ����� ����� ������������� �����.
 * � ��������� ��������� ��� ����� �� 1 �� ���������� �����.
 */

package by.htp.les03.main;

public class Task13 {

	public static void main(String[] args) {
		int x;
		x = 5;
		int rez = 0;
		
		if (x < 1) {
			System.out.println("����� �� �������������");
		}
		
		for (int i = 1; i <= x; i++) {
			rez += i;
		}
		
		System.out.println(rez);
	}

}
