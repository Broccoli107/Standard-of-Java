package 남궁성_11_22._5단원_연습문제;

public class ex5_9 {
    public static void main(String[] args) {
        char[][] star = {
                {'*', '*', ' ', ' ', ' '}
                , {'*', '*', ' ', ' ', ' '}
                , {'*', '*', '*', '*', '*'}
                , {'*', '*', '*', '*', '*'}

        };

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {

                System.out.printf("[%d,%d]",i,j);

            }
            System.out.println();
        }
    }
}