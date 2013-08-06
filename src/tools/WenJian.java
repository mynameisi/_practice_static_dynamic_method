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
	 * �˹��캯������һ����ʾ�ļ���ַ���ַ���
	 * ����ַ�����ʾ���ļ����ڣ��򹹽�WenJian����
	 * ��������ڣ�����ʾ���󣬲�Ҫ���û����������ļ���ַ
	 * @param fileName
	 */
	public WenJian(String fileName) {
		f = new File(fileName);
		if (!f.isFile()) {
			try {
				throw new FileNotFoundException();
			} catch (FileNotFoundException e) {
				System.out.println("�ļ�:" + f.getAbsolutePath() + "�����ڣ���˶Ժ����´���");
			}
		}
		SIZE = Long.toString(f.length());
		NAME = f.getName();
		IMMEDIATE_FOLDER = f.getParentFile().getName();
	}
	/**
	 * �˹��캯��ͨ��һ��WenJian�������µĶ���
	 * @param wj
	 */
	public WenJian(WenJian wj) {
		SIZE = Long.toString(wj.size(0));
		NAME = wj.name();
		IMMEDIATE_FOLDER = wj.folder();
	}
	/**
	 * ������������ļ��Ĵ�С, ����</br> 
	 * int i=size(0), ���i=14��ʾ�ļ��Ĵ�С��14bit</br> 
	 * int i=size(1), ���i=14��ʾ�ļ��Ĵ�С��14byte</br>
	 * 
	 * @param choice
	 *            0����λ��bit��1����λ��byte, -1��ʾchoice�������
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
			System.out.println("size ����ֻ�ܽ�����������\n 0: ��ʾ��λ��bit\n 1: ��ʾ��λ��byte");
		} finally {
			return -1;
		}
	}
	/**
	 * ������������ļ���ȥ����׺��������</br>
	 * �������ļ���</br>
	 * C:/1/1.txt</br>
	 * ��name()�ķ���ֵ���� 1</br>
	 * D:/1/123.avi</br>
	 * ��name()�ķ���ֵ����123</br>
	 * 
	 * @return ȥ����׺�����ļ����������
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
			System.out.println("�ļ��ĺ�׺���������⣬�����ļ�����������д");
		} finally {
			return null;
		}
	}
	/**
	 * ������������ļ����ϲ��ļ��е����� </br>
	 * ���磺 </br>
	 * �����ļ��� C:/1/2/3/4/5/1.txt </br>
	 * folder()�ķ���ֵ����   5 </br>
	 * �����ļ���D:/3/123.txt </br>
	 * folder()�ķ���ֵ����   3 </br>
	 * 
	 * @return �ļ����ڵ��ļ��е�����
	 */
	public String folder() {
		return this.IMMEDIATE_FOLDER;
	}
	/**
	 * �˷������ļ��ж�ȡ��һ���ַ���
	 * 
	 * @return ���ش��ļ��ж����ĵ�һ���ַ���
	 */
	public String readOneString() {
		return Input.getOneStringFromFile(f);
	}
	/**
	 * �˷�����һ���ַ��� S ���ļ�ԭ�е����ݸ��ǵ�
	 * 
	 * @param s �����ļ����ַ���s
	 * @return
	 */
	public boolean writeOneString(String s) {
		return Output.WriteOneStringToFile(f, s);
	}
}
