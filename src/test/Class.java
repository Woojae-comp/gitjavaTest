package test;

public class Class {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int x = 100;
		int y = 120;
		System.out.print(x + y);
		System.out.print(x + y);
		System.out.print(x + y);
		System.out.println(x + y);
		
		int num; // 정수 변수 선언과 동시에 초기값을 선언하던가, 변수 선언 이후에 해도 됨
		num = 100; // 초기값 설정
		
		double numDouble;
		numDouble = 3.14;
		System.out.println(num + numDouble);
		
		String str = "안녕하세요";
		str = "할로";
		System.out.println(str);
		
		boolean logi;
		logi = true; // true or false
		System.out.println(logi); // 아스키코드 문자가 저장됨
		
		
		char ch2 = 65;
		System.out.println(ch2); // 아스키코드 문자가 저장됨
		
		char ch = 'A';
		System.out.println(ch);
	
		// 파이썬 : int(numDouble) -> 정수로 형변환
		int dint;
		dint = (int)numDouble;
		System.out.println(dint); // 결과값 : 3
		
		double idou= (double) num;
		System.out.println(idou); // 결과값 : 100.0
// 문자열을 정수로 바꾸거나 정수를 문자열을 바꿀 때가 문제임
		
		String strInt = "1000";
		System.out.println(strInt + strInt); // 결과값 : 100.0
		// Wrapper 클래스를 사용하여 문자열 -> 정수(실수) 형변환 해야함
		
		int strSample = Integer.parseInt(strInt);
		System.out.println(strSample +strSample); // 계산됨
		// javalang은 생략해도 됨
		
		String strDouble2 = "3.14";
		double strSam2 = Double.parseDouble(strDouble2);
		System.out.println(strSam2); // 문자열 3.14가 실수로 바뀜 
		
		// 정수(실수)를 문자열로 변환
		// 파이썬에는 str()에 넣으면 됨
		
		int num10 = 157;
		// 위에서 사용했던 변수를 다시 선언하면 에러남 
		
		String strint = String.valueOf(num10);
		
		System.out.println("문자열로 변환된 값 : " + strint + strint); // 문자열 3.14가 실수로 바뀜 
		
		System.out.printf("정수값 출력: %d", num10); //%d, %f, %s
		
		
		
		
	}
	
}