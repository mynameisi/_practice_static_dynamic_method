package tools;
/**
 * 这个类是一个简单的 数学 类
 * 他其中包含4个静态的方法：加，减，乘，除
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
