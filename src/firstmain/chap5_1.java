package firstmain;
import java.util.*;

public class chap5_1 {
	public static void main(String[] args) {
		int[] iarr1 = new int[10];
		int[] iarr2 = new int[10];
		int[] iarr3 = new int[]{100,95,80,70,60}; // int[] iarr3 = {100,95,80,70,60}; �̷��� �ᵵ��
		char[] charr = {'a','b','c','d'};
		
		for(int i=0; i < iarr1.length; i++) {
			iarr1[i] = i+1; //1~10 ���� ������� �迭�� �ֱ�
		}
		
		for(int i=0; i < iarr2.length; i++) {
			iarr2[i] = (int)(Math.random()*10) +1; //1~10�� ���� �迭�� ����
		}
		
		//�迭�� ����� ������ ���
		for(int i=0;i < iarr1.length; i++) {
			System.out.print(iarr1[i]+",");
		}
		System.out.println();
		System.out.println(Arrays.toString(iarr2));
		System.out.println(Arrays.toString(iarr3));
		System.out.println(Arrays.toString(charr));
		System.out.println(iarr3);
		System.out.println(charr);
	}
}

/*Ÿ��[] �����̸�;
�ʱ�ȭ���� �� ����-> Ÿ��[] �����̸� = new Ÿ��[����];  int[] score = new int[5];
�迭 �ʱ�ȭ -> int[] score = new int[]{50,60,70,80,90};
�迭 ����->�迭�̸�.length 

*/