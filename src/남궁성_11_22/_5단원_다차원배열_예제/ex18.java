package 남궁성_11_22._5단원_다차원배열_예제;

public class ex18 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
        };

        int sum = 0;


        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d", i, j, score[i][j]);
                System.out.println();
            }

        }
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {

             sum+=score[i][j];

            }
        }

        System.out.println("sum="+sum);

    }
}