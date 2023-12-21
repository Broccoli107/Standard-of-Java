package 남궁성_11_22._5단원_2차원배열quiz;


import java.util.Arrays;

//1부터 25가 담긴 1차원 배열을 섞으다음, 5X5크기의 2차원 배열에 복사해서 출력
public class ex02 {
    public static void main(String[] args) {
    //1.크기가 25인 배열을 생성

        // 2. 1~25 초기화
    //3.섞는다.
    //5x5배열생성
    //1차원 ->2차원 복사
    //2차원 배열 출력



        int[] numArr1= new int [25]; //1차원 배열 생성
        int[][] numArr2= new int [5][5]; //2차원 배열 생성

        for( int i =0; i< numArr1.length; i++){  //1차원 배열에 1~25까지의 수를 집어넣는다.
            numArr1[i]=i+1;
        }

        for (int i=0; i<25; i++){ //숫자를 섞는다.
            int n=(int)(Math.random()*25); //0에서 부터 25미만의 정수
            int tmp = numArr1[0]; //numArr1의 자리 0에있는값을 tmp에 저장
            numArr1[0]=numArr1[n];// numArr1 임의의 n 자리의 값을 자리0에 집어널는다.
            numArr1[n]= tmp; // tmp에 저장되있던 값을 n자리에 집어넣는다. 고로 n자리의 값과 0자리의 값이 서로 바뀐다. 이걸 100회 실시
        }
        //numArr1은 섞여있는 상태에서 이값을 numArr2에 집어넣기

            int k= 0;
        //이차원배열을 일차원 배열로 ,일차원배열을 이차원배열로 연습
        for (int i=0; i<numArr2.length; i++ ){
            for (int j=0; j<numArr2[i].length; j++){

                numArr2[i][j]=numArr1[k];//각 자리에 numArr1을 numArr2에 집어 넣어 준다.
                k++;
                System.out.printf("[%d]",numArr2[i][j]);//출력해준다.
            }
            System.out.println();
        }
        //

    }
}
