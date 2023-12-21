package 남궁성_11_21._5단원예제;

public class ex08 {
    public static void main(String[] args) {

        int[] ball =new int[6];

        for(int i =0; i< ball.length; i++){
            ball[i]=(int)(Math.random()*45)+1;
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
        }




    }

}
