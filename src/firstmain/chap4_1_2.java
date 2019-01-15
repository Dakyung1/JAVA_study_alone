package firstmain;
import java.util.*;

public class chap4_1_2 {

	public static void main(String[] args) {
		int score =0; //점수 저장 위한 변수
		char grade= ' ', opt = '0';//학점 저장 위한 변수, 공백을 초기화
		
		System.out.print("점수를 입력하세요: ");
		Scanner scan =new Scanner(System.in);
		score =scan.nextInt();
		
		System.out.printf("당신의 점수는 %d 입니다.%n", score);
		
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
		System.out.printf("당신의 학점은 %c%c 입니다.%n", grade, opt);

	}

}
