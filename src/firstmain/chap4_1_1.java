package firstmain;
import java.util.*;

public class chap4_1_1 {

	public static void main(String[] args) {
		int score =0; //점수 저장 위한 변수
		char grade= ' '; //학점 저장 위한 변수, 공백을 초기화
		
		System.out.print("점수를 입력하세요: ");
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
		System.out.println("당신의 학점은 "+ grade +" 입니다.");
		
	}

}

//if(){} 
//블럭내의 문장이 하나일 경우에는 {} 생략이 가능하다
