package com.example.calculator2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드를 private으로 수정
    private List<String> resultRecord;

    public Calculator() {
        // 컬렉션 타입 필드 초기화
        this.resultRecord = new ArrayList<>();
    }

    // 양의 정수 2개와 연산 기호를 매개변수로 받아 사칙연산을 수행하는 메서드
    public Integer calculate(int num1, int num2, char symbol) {
        Integer result = null;

        switch (symbol) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("연산기호는 (+, -, *, /) 중에서만 입력가능합니다.");
        }

        // 연산 결과를 저장
        if (result != null) {
            resultRecord.add(num1 + " " + symbol + " " + num2 + " = " + result);
        }

        // 결과 반환
        return result;
    }

    // Getter 메서드
    public List<String> getResultHistory() {
        return new ArrayList<>(resultRecord);
    }

    // Setter 메서드
    public void setResultRecord(List<String> newRecord) {
        this.resultRecord = new ArrayList<>(newRecord);
    }

    // 연산 결과 기록을 출력하는 메서드
    public void printResultRecord() {
        System.out.println("");
        System.out.println("<연산기록>");
        for (String record : resultRecord) {
            System.out.println(record);
        }
    }

    // 가장 먼저 저장된 데이터를 삭제하는 메서드
    public void removeResult() {
        if (!resultRecord.isEmpty()) {
            String removeResult = resultRecord.remove(0);
            System.out.println("삭제된 기록: " + removeResult);
        } else {
            System.out.println("삭제할 연산 기록이 없습니다.");
        }
    }
}
