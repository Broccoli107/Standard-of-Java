package 남궁성_11_29._6단원_연습문제;

public class Ex6_24 {
    static int abs (int value){
        if(value<0){
            return -value;
        }
        else return value;
    }

    public static void main(String[] args) {
        int value =5;
        System.out.println(value+"의 절대값:" +abs(value));

        value=-10;
        System.out.println(value+"의 절대값:" +abs(value));

    }



}
