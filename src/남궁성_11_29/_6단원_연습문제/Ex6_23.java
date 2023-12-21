package 남궁성_11_29._6단원_연습문제;

public class Ex6_23 {
    static int max(int[] arr) {

        int max = arr[0];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;


    }


}
