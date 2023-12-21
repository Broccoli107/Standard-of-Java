package 남궁성_11_21.연습문제04단원;

public class ex02 {

    public static void main(String[] args) {
        int sum=0;

        for(int i=1; i<=20; i++ ) {
            if (i % 2 == 0 || i%3==0 ){
             sum+=i;
            }


        }
        System.out.println(sum);
    }
}
