package firstmain;
import java.util.*;

public class chap4_1_1 {

	public static void main(String[] args) {
		int score =0; //���� ���� ���� ����
		char grade= ' '; //���� ���� ���� ����, ������ �ʱ�ȭ
		
		System.out.print("������ �Է��ϼ���: ");
		Scanner scan =new Scanner(System.in);
		score =scan.nextInt();
		
		if(score >= 90) {
			grade = 'a';
		}else if(score >= 80) {
			grade = 'b';
		}else if(score >= 70) {
			grade = 'c';
		}else {
			grade ='d';
		}
		System.out.println("����� ������ "+ grade +" �Դϴ�.");
		
	}

}

//if(){} 
//������ ������ �ϳ��� ��쿡�� {} ������ �����ϴ�
