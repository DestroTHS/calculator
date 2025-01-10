package com.example.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Calculator 인스턴스 생성
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("첫번째 숫자 입력 (종료:exit) : ");
            String input = sc.next();

            if (input.equals("exit")) {
                System.out.println("계산기 종료");
                calculator.printResultRecord();
                break;
            }

            int num1 = Integer.parseInt(input);
            System.out.print("두번째 숫자 입력 : ");
            int num2 = sc.nextInt();

            System.out.print("원하는 연산기호 입력 : ");
            char symbol = sc.next().charAt(0);

            //연산부분을 Calculator 클래스가 담당하도록 연결
            Integer result = calculator.calculate(num1, num2, symbol);
            if (result != null) {
                System.out.println("결과값 : " + result);
            }
        }
    }
}
