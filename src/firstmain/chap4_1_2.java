package firstmain;
import java.util.*;

public class chap4_1_2 {

	public static void main(String[] args) {
		int score =0; //���� ���� ���� ����
		char grade= ' ', opt = '0';//���� ���� ���� ����, ������ �ʱ�ȭ
		
		System.out.print("������ �Է��ϼ���: ");
		Scanner scan =new Scanner(System.in);
		score =scan.nextInt();
		
		System.out.printf("����� ������ %d �Դϴ�.%n", score);
		
		if(score >= 90) {
			grade = 'a';
			if(score >=98){
				opt = '+';
			}else if(score < 94) {
				opt ='-';
			}
		}else if(score >= 80) {
			grade = 'b';
			if(score >= 88) {
				opt ='+';
			}else if(score < 84) {
				opt='-';
			}
		}else if(score >= 70) {
			grade = 'c';
		}else {
			grade ='d';
		}
		System.out.printf("����� ������ %c%c �Դϴ�.%n", grade, opt);

	}

}
