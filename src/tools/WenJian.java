package tools;
import java.io.File;
import java.io.FileNotFoundException;
import tools.IO.Input;
import tools.IO.Output;
import tools.MyExceptions.ChoiceException;
import tools.MyExceptions.SuffixException;
public class WenJian {
	private File f = null;
	private final String SIZE;
	private final String NAME;
	private final String IMMEDIATE_FOLDER;
	/**
	 * 此构造函数接收一个表示文件地址的字符串
	 * 如果字符串表示的文件存在，则构建WenJian对象
	 * 如果不存在，则提示错误，并要求用户重新输入文件地址
	 * @param fileName
	 */
	public WenJian(String fileName) {
		f = new File(fileName);
		if (!f.isFile()) {
			try {
				throw new FileNotFoundException();
			} catch (FileNotFoundException e) {
				System.out.println("文件:" + f.getAbsolutePath() + "不存在，请核对后重新创建");
			}
		}
		SIZE = Long.toString(f.length());
		NAME = f.getName();
		IMMEDIATE_FOLDER = f.getParentFile().getName();
	}
	/**
	 * 此构造函数通过一个WenJian对象构造新的对象
	 * @param wj
	 */
	public WenJian(WenJian wj) {
		SIZE = Long.toString(wj.size(0));
		NAME = wj.name();
		IMMEDIATE_FOLDER = wj.folder();
	}
	/**
	 * 这个方法返回文件的大小, 比如</br> 
	 * int i=size(0), 如果i=14表示文件的大小是14bit</br> 
	 * int i=size(1), 如果i=14表示文件的大小是14byte</br>
	 * 
	 * @param choice
	 *            0代表单位是bit，1代表单位是byte, -1表示choice输入错误
	 * @return
	 */
	@SuppressWarnings("finally")
	public int size(int choice) {
		switch (choice) {
		case 0:
			return Integer.parseInt(this.SIZE) * 1024;
		case 1:
			return Integer.parseInt(this.SIZE);
		}
		try {
			throw new ChoiceException();
		} catch (ChoiceException e) {
			System.out.println("size 方法只能接收两个参数\n 0: 表示单位是bit\n 1: 表示单位是byte");
		} finally {
			return -1;
		}
	}
	/**
	 * 这个方法返回文件的去掉后缀名的名称</br>
	 * 比如有文件：</br>
	 * C:/1/1.txt</br>
	 * 那name()的返回值就是 1</br>
	 * D:/1/123.avi</br>
	 * 那name()的返回值就是123</br>
	 * 
	 * @return 去掉后缀名的文件本身的名称
	 */
	@SuppressWarnings("finally")
	public String name() {
		int dot = NAME.lastIndexOf('.');
		if ((dot > -1) && (dot < (NAME.length()))) {
			return NAME.substring(0, dot);
		}
		try {
			throw new SuffixException();
		} catch (SuffixException e) {
			System.out.println("文件的后缀名出现问题，请检查文件声明重新书写");
		} finally {
			return null;
		}
	}
	/**
	 * 这个方法返回文件的上层文件夹的名称 </br>
	 * 比如： </br>
	 * 对于文件： C:/1/2/3/4/5/1.txt </br>
	 * folder()的返回值就是   5 </br>
	 * 对于文件：D:/3/123.txt </br>
	 * folder()的返回值就是   3 </br>
	 * 
	 * @return 文件所在的文件夹的名称
	 */
	public String folder() {
		return this.IMMEDIATE_FOLDER;
	}
	/**
	 * 此方法从文件中读取第一个字符串
	 * 
	 * @return 返回从文件中读到的第一个字符串
	 */
	public String readOneString() {
		return Input.getOneStringFromFile(f);
	}
	/**
	 * 此方法用一个字符串 S 把文件原有的内容覆盖掉
	 * 
	 * @param s 覆盖文件的字符串s
	 * @return
	 */
	public boolean writeOneString(String s) {
		return Output.WriteOneStringToFile(f, s);
	}
}
