package firstmain;
//상수,리터럴
public class chap2_2 {
	public static void main(String[] args) {
		final int width = 20;
		final int height = 10;
		
		int trianglearea = (width * height) /2; //삼각형 면적
		int rectanglearea = width * height; //사각형 면적
		
		System.out.println(trianglearea);
		System.out.println(rectanglearea);
		System.out.printf("triangle: %d%n", trianglearea);
		
		String name = "Ja" + "va";
		String str = name + 83.;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println(""+ 7 +7);
	}
}

/*
변수 : 하나의 값을 저장하기 위한 공간
상수 : 값을 한번만 저장할 수 있는 공간(한 번 값을 저장하면 다른값으로 변경 불가)
리터럴 : 그 자체로 값을 의미하는 것
*/

