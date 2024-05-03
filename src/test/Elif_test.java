package test;

public class Elif_test {

	public static void main(String[] args) {

		int score = 85;
		
		if(score >= 90) {
			System.out.println("수");
		} else if (score >= 80) {
			System.out.println("우");
		} else if (score >= 70) {
			System.out.println("미");
		} else {
			System.out.println("가");
		}
		
		
		// switch 문 자주 안씀 - if 문으로 많이 씀
		
		int favor = 2; // 케이스 1일 경우 다 실행하는 것임

		// break가 없을 경우에는 다른 경우임 
		// 변수가 범주형인 경우 category형이면 할만함 // 셋중에 하나만 일때 / String으로 처리해도 됨
		// *** if문 보다 간결 할 수 있음 *** 
		
		switch(favor) { // favor 값이랑 비교
			case 1:
				System.out.println("안녕");
				break;
			case 2:
				System.out.println("감사");
				System.out.println("고맙");
				break;
			case 3:
				System.out.println("하이");
				break;
			default: // else 
				System.out.println("잘가");
		}
		
		
	}

}