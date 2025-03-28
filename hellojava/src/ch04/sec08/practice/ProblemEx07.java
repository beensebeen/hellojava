package ch04.sec08.practice;

import java.util.Scanner;

public class ProblemEx07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		boolean game = true;
		
		while(game) {
			System.out.println("==================");
			System.out.println("[숫자맞추기게임 시작]");
			System.out.println("==================");
			
			int randomNum = (int)(Math.random()*6) + 1; //랜덤 숫자
			int num = 0; //입력한 숫자

			while(true) {
				num = sc.nextInt();
				
				if (randomNum == num) {
					System.out.println("정답입니다.");
					break;
				} else if (randomNum > num) {
					System.out.println("더 높게");
				} else {
					System.out.println("더 낮게");
				}
			}
			
			System.out.println("다시 하시겠습니까? y/n");
			if(sc.next().equals("n")) {
				game = false;
				break;
			} else {
				continue;
			}
		}
		System.out.println("게임 종료");
	}
}

