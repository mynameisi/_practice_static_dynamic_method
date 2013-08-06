package Application;

import tools.Constants;
import tools.WenJian;

public class B_InstanceMethod_1 {
	/**
	 * 程序运行的结果是: 文件:"./2/1.txt" 的大小是: 3072 BYTE 文件:"./2/1.txt" 的名称是: 1
	 * 文件:"./2/1.txt" 中第一个String是: 17 成功写入abc 到文件：./2/1.txt中 文件:"./2/1.txt"
	 * 中第一个String是: abc
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		/**
		 *  例子：
		 *  把 "./2/1.txt" 文件的大小以bit的形式放到int y1中
		 *  1. 首先通过构造函数 wj 构建对象: WenJian wj=new WenJian(Constants.FILE_2_1);
		 *     注意：在这里我没有用：
		 *     WenJian wj=new WenJian("./2/1.txt");
		 *     而是用了：
		 *     WenJian wj=new WenJian(Constants.FILE_2_1);
		 *     是因为：Tools包中的Constants这个类中的静态常量FILE_2_1就="./2/1.txt"
		 *     我们在实际编程中经常用这种方式，先把一个常用的字符串放到一个类的静态常量中
		 *     然后在通过调用这个常量的方法调用这个字符串，这样做有很多好处，比如：
		 *     1. 如果在这个文件中有1000000次对"./2/1.txt"的调用，结果在书写之后发现地址写错了，我们就需要改1000000次
		 *        但是如果你写的这1000000次不是直接写的"./2/1.txt", 而是全都是调用 Constants.FILE_2_1 代替的，那么我只需要
		 *        改 Constants.FILE_2_1 一次，这1000000次调用就都改了
		 *     2. 把整个项目中常用的字符串放在一个类中，比散落在不同的文件中更容易查找
		 *     3. 用Eclipse输入Constants后，会自动弹出提示窗口让我们选择变量，这样比直接输入"./2/1.txt"更方便
		 *     4...还有很多优势
		 *     
		 *  2. 然后调用 size 方法，因为要求显示的单位是BIT，所以size吃的值是0
		 *     int y1=wj.size(0);
		 *     
		 *  请参考y1 完成y2 ~ y4，注意对象wj不用重复声明，一个就够了
		 *  
		 */
		
		WenJian wj=new WenJian(Constants.FILE_2_1);
		int y1 = wj.size(0);
		System.out.println("文件:\"" + Constants.FILE_2_1 + "\" 的大小是: " + y1 + " BIT");
		// 把 "./2/1.txt" 的不要后缀的文件名"1"放到String y2中
		String y2 = ;
		System.out.println("文件:\"" + Constants.FILE_2_1 + "\" 的名称是: " + y2 + "");
		// 把 "./2/1.txt" 文件中的第一个字符串读出来，放到Stirng y3中
		String y3 = ;
		System.out.println("文件:\"" + Constants.FILE_2_1 + "\" 中第一个String是: " + y3 + "");
		// 把 "abc"写到"./2/1.txt" 文件中, 再把"abc"读出来放到String y4里，写回到17
		String temp = "abc";
		;//<-- 在这里要加入一句话，把temp写到文件中
		System.out.println("成功写入" + temp+" 到文件："+Constants.FILE_2_1+"中");
		String y4 = ;//<--把"./2/1.txt"文件里的内容再次读入到y4里
		System.out.println("文件:\"" + Constants.FILE_2_1 + "\" 中第一个String是: " + y4 + "");
		wj.writeOneString("17");
	}
}
