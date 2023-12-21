package 남궁성_12_08._9단원_연습문제.Ex9_11;

import java.util.Scanner;

public class Ex9_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("시작 단을 입력하세요: ");
        int from = scanner.nextInt();

        System.out.println("끝 단을 입력하세요: ");
        int to = scanner.nextInt();

        if (from > to) {
            int tmp = from;
            from = to;
            to = tmp;
        }

        for (int i = from; i <= to; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }

    }

