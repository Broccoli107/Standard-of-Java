package 코테;

import java.util.Arrays;

public class ex {
    public static void main(String[] args) {
        int [] arr= {1,2,3,98,99,100};
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] solution (int [] arr){
        //for문으로 지역변수로 받은 배열을 하나하나씩 확인
        for (int i=0; i< arr.length; i++){
            //50보다크거나 같고 짝수면 2로 나눈다.
            if(arr[i]>=50 && arr[i]%2==0) {
                arr[i] = arr[i] / 2;
            }
            //50보다 작은 홀수 면 2를곱한다.
            else if (arr[i]<50 && arr[i]%2==1) {
                arr[i] =arr[i]*2;

            }
            int[] answer = new int[arr.length];

        }
            return arr;
    }
}
