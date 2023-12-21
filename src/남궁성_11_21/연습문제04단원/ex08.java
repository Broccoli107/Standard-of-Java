package 남궁성_11_21.연습문제04단원;

public class ex08 { public static void main(String[] args) {
    for(int i=0; i<=10; i++){
        for(int j =0; j<=10;j++ ){
            if(2*i+4*j==10){
                System.out.printf("x=%d, y=%d",i,j);
                System.out.println();
            }
        }
    }
}

}
