package 남궁성_11_21.연습문제04단원;

public class ex03 {

    public static void main(String[] args) {
    int sum=0;


    for (int i=1; i<=10; i++){
     for(int j=1; j<=i; j++){
         sum+=j;
     }
    }
        System.out.println("sum="+sum);
    }
}
