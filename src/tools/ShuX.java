package tools;
/**
 * �������һ���򵥵� ��ѧ ��
 * �����а���4����̬�ķ������ӣ������ˣ���
 * 
 * @author Administrator
 *
 */
public class ShuX {
	public static int jia(int x, int y) {
		return x + y;
	}
	public static int jian(int x, int y) {
		return x - y;
	}
	public static String cheng(int x, String y) {
		return Integer.toString(x * Integer.parseInt(y));
	}
	public static double chu(int x, int y) {
		return ((double) x) / y;
	}
}
