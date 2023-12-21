package 남궁성_12_08._9단원_연습문제.Ex9_8;

public class Ex9_8 {

//    //메서드명: round
//    //기능: 주어진 값을 반올림하여, 소수점 이하 n자리의 값을 반환한다.
    static double round (double d, int n) {
        float f=0f;
        for (int i = 0; i < n; i++) {
            d = d * 10;
        }

        d=Math.round(d);


        for (int i = 0; i < n; i++) {
            d= d / 10.0;

        }
        return d ;
    }

        public static void main(String[] args) {
            System.out.println(round(3.1415,1));
            System.out.println(round(3.1415,2));
            System.out.println(round(3.1415,3));
            System.out.println(round(3.1415,4));
            System.out.println(round(3.1415,5));
        }
    }










