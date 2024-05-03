package test;

public class For_practice {

	public static void main(String[] args) {

		
// 파이썬의 경우
//		for i in range(1,11): 
//			print(i)
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) { // 초기값; 조건식; 증감식 // i를 선언해야됨 -> 보통 한줄에 다 넣음
			System.out.println("회전 : " + i);
			sum = sum + i;
			System.out.println("결과값 : "+ sum);
			}
		System.out.println(sum); // java에서는 range 개념이 없음 // 조건식 없으면 무한루프
		int sum1 = 200;
		for(int i = 100; i >= 1; i--) { // 초기값; 조건식; 증감식 // i를 선언해야됨 -> 보통 한줄에 다 넣음
			System.out.println("회전 : " + i);
			sum1 = sum1 - i;
			System.out.println("결과값 : "+ sum1);
			}
		System.out.println(sum1); // java에서는 range 개념이 없음 // 조건식 없으면 무한루프
		
		// 0~1000 사이의 수중 짝수만 출력하는 for문
		for(int i = 0 ; i<=1000 ;i = i+2) {
			System.out.println(i);
		}
		int sum2 = 0; // 초기값을 꼭 선언해야지 error가 안남
		for(int i = 1; i<=100; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
	}
}
