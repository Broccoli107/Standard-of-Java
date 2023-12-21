package 남궁성_11_21.연습문제04단원;

public class ex10 {
    public static void main(String[] args) {
        int num=12345;
        int sum=0;
        while (num>0){
            sum+=num%10;
            num=num/10;

        }
        System.out.printf("sum="+sum);
    }
}
