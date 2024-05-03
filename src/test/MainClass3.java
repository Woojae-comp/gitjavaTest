package test;

public class MainClass3 {

	public static void main(String[] args) {
		// if 괄호 (조건)
		// java의 if문 형식
//		if (10 > 50) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		
//		}			

		
		int num = 100; // 숫자는 변수로 선언 Class로 선언된 문자열은 객체로 선언
		if (num == 100) { // 숫자 값을 비교할 때는 부등호를 사용
			System.out.println("축하합니다! 100점 입니다!");
			} else {
			System.out.println("축하합니다! 100점 입니다!");
					
			}
		String str1 = "Korea";
		String str2 = "Korea";
		
		// 문자열 비교는 이렇게 하는게 맞음 등호 == 이걸 가지고 할 땐 오류가 날 수 있음
		if(str1.equals(str2)) {
			System.out.println("당신은 한국인 입니다.");
		}
		
	}
}



