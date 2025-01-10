package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //반복문 시작
        while (true) {
            //정수와 연산기호를 입력받는 부분
            System.out.print("첫번째 숫자 입력 (종료:exit) : ");
            String input = sc.next();

            //입력받은 값이 exit이면 종료
            if (input.equals("exit")) {
                System.out.println("계산기 종료");
                break;
            }

            int num1 = Integer.parseInt(input); //입력된 값을 int타입으로 변경

            System.out.print("두번째 숫자 입력 : ");
            int num2 = sc.nextInt();

            System.out.print("원하는 연산기호 입력 : ");
            char symbol = sc.next().charAt(0);

            //연산을 처리하는 부분 (조건문)
            switch (symbol) {
                case '+': //입력받은 연산기호가 + 일때 덧셈연산 수행
                    System.out.println("결과값 : " + (num1 + num2));
                    break;
                case '-': //입력받은 연산기호가 - 일때 뺄셈연산 수행
                    System.out.println("결과값 : " + (num1 - num2));
                    break;
                case '*': //입력받은 연산기호가 * 일때 곱셈연산 수행
                    System.out.println("결과값 : " + (num1 * num2));
                    break;
                case '/': //입력받은 연산기호가 / 일때 나눗셈연산 수행
                    if (num2 == 0) { //두번째로 입력받은 숫자가 0과 같으면 아래 메시지 출력 (연산 수행 x)
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else { //그렇지 않으면 아래 메시지 출력 (연산 수행)
                        System.out.println("결과값 : " + (num1 / num2));
                    }
                    break;
                default: //입력받은 기호가 사칙연산기호가 아닐 때 아래 메시지 출력
                    System.out.println("연산기호는 (+, -, *, /) 중에서만 입력가능합니다.");
            }
        }
    }
}
