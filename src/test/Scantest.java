package test;

import java.util.Scanner;

public class Scantest {

	public static void main(String[] args) {
		
// 파이썬의 input 문
		Scanner scanner;  // Scanner 클래스로 객채를 선언
		scanner = new Scanner(System.in); // 객채를 초기화하려면 new 연산자를 처음에 기입해야함
		System.out.print("이름을 입력하시오 : ");

		String inputData = scanner.nextLine(); // 엔터키를 치기 전까지 입력된 문자열을 가져옴
		System.out.print("이름 : " + inputData);
// 파이썬의 input 문, print 문을 따로 써줘야함
		
		
		
	}

}
