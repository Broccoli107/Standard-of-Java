package 남궁성_12_11._9단원_예제;

import java.util.Random;

public class Ex9_28 {
    public static void main(String[] args) {

        Random rand= new Random(); //렌덤타입의 참조변수로 Random클래스의 객체를 다룬다.
        int [] number = new int [100];
        int [] counter = new  int [10];

        for  ( int i=0 ; i<number.length; i++){
            System.out.print( number[i]= (int)(Math.random()*10));// 0이상 10미만의 임의의 정수를 number배열에 각각 집어넣는다.
            System.out.print(number[i]=rand.nextInt(10));// 0이상 10미만의 임의의 정수를 numer 배열에 각각 집어넣는다.
        }
        System.out.println();
        for ( int i =0; i < number.length; i++){
            counter[number[i]]++; // number의 i번째 수기 니오면 그 수의 번쨰에 나온만큼 값이 증가해
            // number의 i 번째 수가 몇번 나오는지 알 수가있다.
        }

        for ( int i =0; i< counter.length; i++) {
            System.out.println(i + "의 개수 :" +printGrapgh('*',counter[i])+ " " + counter[i]);
        }


    }


public static String printGrapgh ( char ch, int value){
        char[] bar = new char [value]; // value 값 만큼의 길이를 가진 문자 배열 생성



        for (int i =0; i<bar.length; i++){ //배열 각각에 문자를 집어 넣는다.
            bar[i]= ch;
        }
        return new String(bar); //배열을 문자열로 반환

}





}
