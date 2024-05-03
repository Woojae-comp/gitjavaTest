package test;

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		
		int result_x = ++x; // x = x + 1
		System.out.println(result_x);
		System.out.println(x); // 연산을 한번 당하고 나면 x값이 덮어 씌워짐 // 누적식
		int result_y = y++;
		
		System.out.println(result_y); // 21 예상 20이 나옴
		System.out.println(y); // 예상대로 21이 됨
		// 증감 연산자 앞에 있는지 뒤에 있는지 중요함 
		// 어쨌든 본인 값은 최종 결과 값은 1씩 증가함
		
		// 문제는 다른 연산자와 같이 쓸 때가 문제임
		int a = 1;
		int result_a = ++a + 10;
		System.out.println(result_a); // ++a + 2 + 10 // 증감연산자 앞에 있으면 우선순위가 높아짐
		System.out.println(a);

		int b = 1;
		int result_b = b++ + 10; // 제일 마지막에 계산 // 1인 상태에서 + 10이 됨
		System.out.println(result_b);
		System.out.println(b);
		
		int sum = 0;
		int i = 10;
		sum = sum + i;
		sum += i; // == sum = sum + i;
		
		sum = sum * i;
		sum *= i; // == sum = sum * i;
		
		// 삼항 연산자 if 문을 한방에 쓴거임
		
		
		int x1 = 10;
		int y1 = 5;
		System.out.println((x1>7) && (y1<=5));
		System.out.println((x1 % 3 == 2  ) || (y1 % 2 !=  1));
		
		
		
	}

}
