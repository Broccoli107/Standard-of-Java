package 남궁성_12_06.연습문제_6_7단원;

import java.util.Arrays;

public class Ex6_23 {
    //메서드 명: max
    //주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
    //만일 주어진 배열이 null 이거나 크기가 0인경우 -999999룰 반환한다.
    //반환타입: int
    //매개변수 int[]arr

   static int max ( int [] arr){
 //일단 null과 길이가 0인 배열을 -999999을 반환해주는 것부터 해주자.
       if( arr == null || arr.length==0 )
           return  -9999999;

  //큰 숫자를 옆으로 이동하는 방법을 이용
// if (arr[0]>arr[1]) {
//       int tmp =arr[0];
//      arr[0] =arr[1];
//       arr[1]=tmp;   }    //이걸 arr.length-1번 반복하면 맨 오른쪽에 제일 큰 숫자가 온다.
//         //
    for (int i=0; i< arr.length-1; i++){
        if(arr[i]>arr[i+1]){
            int tmp =arr [i];
            arr[i]= arr[i+1];
            arr[i+1]= tmp;
        }
    }
    return arr[arr.length-1];




    
    }

    public static void main(String[] args) {

    int [] data = { 3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println( " 최대값: "+ max(data));
        System.out.println(" 최대값: "+ max(null) );
        System.out.println(" 최대값: "+ max(new int[]{}));


   }


}
