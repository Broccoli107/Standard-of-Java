package 남궁성_12_13._11단원_예제;

import java.util.Arrays;

public class Ex11_18 {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4};
        int [] [] arr2D ={{11,12,13},{14,15,16}};
        System.out.println(Arrays.toString(arr));//Arrays 클래스의 to.String을 호출해서 배열 데이터를 출력한다.
        System.out.println(Arrays.deepToString(arr2D));//다차원 배열은 deepToString을 사용한다.
        int [] arr2 =Arrays.copyOf(arr, arr.length); //arr에 arr.length 만큼 복사해서 배열을 생성해서 arr2에 저장한다.
        int [] arr3 = Arrays.copyOf(arr, 3);// arr에 인덱스 3이전(3미포함) 까지 복사해서 배열 생성
        int [] arr4= Arrays.copyOf(arr,7);//arrf를 복사하고 나머지는 0으로 초기화한 배열 생성
        int [] arr5 = Arrays.copyOfRange(arr,2,4); //arr의 2에서 4(4는 미포함)까지 복사해서 배열생성

        int [] arr6 = Arrays.copyOfRange(arr,0,7);
        int [] arr7 =new int[5];

        Arrays.fill (arr7, 9);//배열을 9로 채운다.
        System.out.println(Arrays.toString(arr7));
        Arrays.setAll(arr7,i ->(int)(Math.random()*6)+1 );
        System.out.println(Arrays.toString(arr7));


        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));



        for (int i : arr7){//arr7에 저장된 데이터를 하나씩 읽어서 i에 저장을 한다.
            char[] graph  =new char[i];//그 값을 가진 문자형 배열을 생성
            Arrays.fill(graph, '*');
            System.out.println(Arrays.toString(graph) +i );

        }

        String [][] str2D =new String[][] {{"aaa", "bbb"}, {"AAA","BBB"}};
        String [][] str2D2= new String[][] {{"aaa", "bbb"}, {"AAA","BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2));
        System.out.println(Arrays.deepEquals(str2D,str2D2)); //다차원 배열일때는 deepEquals로 비교해야한다.

        char [] chArr ={'A','D','C','B','E'};

        System.out.println(Arrays.toString(chArr));
        System.out.println(Arrays.binarySearch(chArr, 'B')); //binarySearch를 하기전에 sort(정렬)을 하지 않아 잘못된 숫자가 니온다.


        Arrays.sort(chArr);
        System.out.println(Arrays.binarySearch(chArr, 'B'));


    }
}
