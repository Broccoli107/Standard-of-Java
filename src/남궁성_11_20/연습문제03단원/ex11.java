package 남궁성_11_20.연습문제03단원;

public class ex11 {
    public static void main(String[] args) {
        int [] num= new int[10];
        int [] counter =new int [10];


        for(int i=0; i< num.length; i++){
            num[i]=(int)(Math.random()*10);
            System.out.print(num[i]);
        }
        System.out.println();

        for(int i=0; i< num.length; i++){
            counter[num[i]]++;
        }

        for(int i=0; i<num.length; i++){
            System.out.printf("%d의 개수:%d",i,counter[i] );
            System.out.println();
        }

    }

    }

