package chap02.ex04.ifstate;

import java.util.Scanner;

public class Japangi {

	public static void main(String[] args) {
		// 돈 과 음료를 선택
		// {콜라 : 2000, 사이다 : 1000, 주스 : 1000, 생수: 500}
		System.out.println("음료를 선택 하세요");
		Scanner scan = new Scanner(System.in);
		String item = scan.nextLine();
		System.out.println("선택한 음료 : " + item);
		
		System.out.println("돈을 넣으세요");
		Scanner scan2 = new Scanner(System.in);
		int money = scan2.nextInt();
		System.out.println("가격 : " + money);
		
	}

}
