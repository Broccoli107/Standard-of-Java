package 남궁성_11_21._5단원예제;

import java.util.Arrays;

//기존에있는 배열에 수들을 10칸짜리 새로운 배열에 랜덤하게 값을 집어 넣는다.
public class ex09 {
    public static void main(String[] args) {
        int [] code ={-4,-1, 3, 6, 11};
        int [] arr=new int[10];
        for(int i=0; i<arr.length;i++){
            arr[i]=code[(int)(Math.random()* code.length)];

        }
        System.out.println(Arrays.toString(arr));
    }
}
