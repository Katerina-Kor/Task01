/* ���� ��� ���� ������������ (� ��������).
����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������. */

package by.htp.les03.main;

public class Task6 {

	public static void main(String[] args) {
		int a = 80;
		int b = 10;

		int c;
		c = 180 - (a + b);

		if (a + b >= 180) {
			System.out.println("������������ �� ����������");
			return;
		} else if (c == 90) {
			System.out.println("����������� ���������� � �� �������������");
		} else {
			System.out.println("����������� ����������");
		}
	}

}
