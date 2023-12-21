package 남궁성_12_11._9단원_예제;

import java.util.Arrays;

public class Ex9_29 {
    public static void main(String[] args) {


        for  ( int i=0;  i<10 ; i++){
            System.out.print(getRand (5, 10)+",");
        }

        int [] result = fillRand( new int [10], new int []{2,3, 7, 5});

        System.out.println(Arrays.toString(result));

    }


//filRand 메서드 작성
    //fromr과 to 사이의 임의의 정수를 각 배열에 저장한다.
    public static int[] fillRand ( int []arr, int from, int to){
        for ( int i= 0; i< arr.length; i++){
            arr[i] = getRand(from, to);

        }
        return arr;
    }


   public static int [] fillRand ( int [] arr, int[] data){ //매개 변수 타입이 다른 메서드 작성 (오버로딩)

   // 주어진 data 배열의 있는 정수들을 가지고 arr 배열의 임의의로 대입 시키는 메서드
    for ( int i=0; i<arr.length; i++){
        arr[i]= data[getRand(0, data.length-1) ];

    }


       return arr;

    }



    //getRand 메서드 작성  from에서 to 범위의 정수 (int) 값을 반환한다. from 과 to 도 범위에 포함된다.
public static int  getRand ( int from, int to){
        return (int)(Math.random()*Math.abs(to-from+1))+Math.min(from,to);

//Math.abs는 절대값 반환하는 메서드 , Math.min은 대소비교해서 작은값 반환하는 메서드이다.
//Math.abs(to-from+1)은 to와 from 을 포함한 to와 from 사이의 정수의 갯수이다.
//거기서 to와 from 중 작은 값을 더 해주는이유는 범위의 시작점을 구하기 위해서이다.그래서 to와 from중 작은 값을 구해서 더하는거다.
    }



}
