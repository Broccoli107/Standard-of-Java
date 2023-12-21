package 남궁성_11_21.연습문제04단원;

public class ex04 {
    public static void main(String[] args) {

    int sum=0;
    int i=1;
    while (true){
         if (sum>100) {
             break;
         }


         if (i%2==0){
                sum-=i;
         }
         else{
                sum+=i;
         }

        ++i;

        }
        System.out.println("i="+i);
        System.out.println("sum="+sum);
    }


    }

