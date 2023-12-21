package 남궁성_11_22._5단원_연습문제;

public class ex5_11 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };
        int[][] result = new int[score.length + 1][score[0].length + 1];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                result[i][j] = score[i][j];//result배열에 score 배열을 대입

                result[i][score[0].length] += result[i][j];// 가로줄의 합을 추가된 세로줄에 값 집어넣기

                result[score.length][j] += result[i][j];//세로 줄의 합을 추가된 가로줄에 집어넣기
                result[score.length][score[0].length] += result[i][j];

            }

        }





        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();

        }
    }
}