package Application;

import tools.Constants;
import tools.WenJian;

public class B_InstanceMethod_1 {
	/**
	 * �������еĽ����: �ļ�:"./2/1.txt" �Ĵ�С��: 3072 BYTE �ļ�:"./2/1.txt" ��������: 1
	 * �ļ�:"./2/1.txt" �е�һ��String��: 17 �ɹ�д��abc ���ļ���./2/1.txt�� �ļ�:"./2/1.txt"
	 * �е�һ��String��: abc
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		/**
		 *  ���ӣ�
		 *  �� "./2/1.txt" �ļ��Ĵ�С��bit����ʽ�ŵ�int y1��
		 *  1. ����ͨ�����캯�� wj ��������: WenJian wj=new WenJian(Constants.FILE_2_1);
		 *     ע�⣺��������û���ã�
		 *     WenJian wj=new WenJian("./2/1.txt");
		 *     �������ˣ�
		 *     WenJian wj=new WenJian(Constants.FILE_2_1);
		 *     ����Ϊ��Tools���е�Constants������еľ�̬����FILE_2_1��="./2/1.txt"
		 *     ������ʵ�ʱ���о��������ַ�ʽ���Ȱ�һ�����õ��ַ����ŵ�һ����ľ�̬������
		 *     Ȼ����ͨ��������������ķ�����������ַ������������кܶ�ô������磺
		 *     1. ���������ļ�����1000000�ζ�"./2/1.txt"�ĵ��ã��������д֮���ֵ�ַд���ˣ����Ǿ���Ҫ��1000000��
		 *        ���������д����1000000�β���ֱ��д��"./2/1.txt", ����ȫ���ǵ��� Constants.FILE_2_1 ����ģ���ô��ֻ��Ҫ
		 *        �� Constants.FILE_2_1 һ�Σ���1000000�ε��þͶ�����
		 *     2. ��������Ŀ�г��õ��ַ�������һ�����У���ɢ���ڲ�ͬ���ļ��и����ײ���
		 *     3. ��Eclipse����Constants�󣬻��Զ�������ʾ����������ѡ�������������ֱ������"./2/1.txt"������
		 *     4...���кܶ�����
		 *     
		 *  2. Ȼ����� size ��������ΪҪ����ʾ�ĵ�λ��BIT������size�Ե�ֵ��0
		 *     int y1=wj.size(0);
		 *     
		 *  ��ο�y1 ���y2 ~ y4��ע�����wj�����ظ�������һ���͹���
		 *  
		 */
		
		WenJian wj=new WenJian(Constants.FILE_2_1);
		int y1 = wj.size(0);
		System.out.println("�ļ�:\"" + Constants.FILE_2_1 + "\" �Ĵ�С��: " + y1 + " BIT");
		// �� "./2/1.txt" �Ĳ�Ҫ��׺���ļ���"1"�ŵ�String y2��
		String y2 = ;
		System.out.println("�ļ�:\"" + Constants.FILE_2_1 + "\" ��������: " + y2 + "");
		// �� "./2/1.txt" �ļ��еĵ�һ���ַ������������ŵ�Stirng y3��
		String y3 = ;
		System.out.println("�ļ�:\"" + Constants.FILE_2_1 + "\" �е�һ��String��: " + y3 + "");
		// �� "abc"д��"./2/1.txt" �ļ���, �ٰ�"abc"�������ŵ�String y4�д�ص�17
		String temp = "abc";
		;//<-- ������Ҫ����һ�仰����tempд���ļ���
		System.out.println("�ɹ�д��" + temp+" ���ļ���"+Constants.FILE_2_1+"��");
		String y4 = ;//<--��"./2/1.txt"�ļ���������ٴζ��뵽y4��
		System.out.println("�ļ�:\"" + Constants.FILE_2_1 + "\" �е�һ��String��: " + y4 + "");
		wj.writeOneString("17");
	}
}
