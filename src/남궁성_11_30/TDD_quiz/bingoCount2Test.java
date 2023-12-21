package 남궁성_11_30.TDD_quiz;

import org.junit.Test;

import static org.junit.Assert.*;
//인텔리제이 TDD 하는법 class에서 우클릭해서 go to에 test를 눌러 test를 생성
//그러면 테스트하는 클래스의이름+Test클래스가 생긴다 거기안에 내가만든 메서드를 전부다 집어넣어준다.
//그리고 그 밑에 @Test를 치고 각 경우의 수를 만들어서 테스트를 해준다. 그래서 밑에 assertTrue를 집어넣어서 결과값이 내가 생각하는것과 맞는지 확인
public class bingoCount2Test {
    static int bingoCount2(int[][] arr) {
//빙고의 카운드를 담아주는 변수 그릇을 만들어준다.
        int cnt = 0;
//이제 빙고를 카운트 하는 방법을 생각해본다. 일단 빙고가 만들어지는 경우의 수를 생각해보자.
        //1.가로 줄이 빌고 일때
        //가로줄이 빙고 일때 가운데 줄의 합이 5이다.
        //첫번째 줄이 합이 빙고잏떄,
//    if(arr[0][0]+arr[0][1]+arr[0][2]+arr[0][3]+arr[0][4]==5){
//       ++cnt;
//    }
//    if(arr[1][0]+arr[1][1]+arr[1][2]+arr[1][3]+arr[1][4]==5){
//        ++cnt;
//    }
//    if(arr[0][1]+arr[0][2]+arr[0][3]+arr[0][4]+arr[0][5]==5){
//        ++cnt;
//    }
//    if(arr[0][1]+arr[0][2]+arr[0][3]+arr[0][4]+arr[0][5]==5){
//        ++cnt;
//    }
//    if(arr[0][1]+arr[0][2]+arr[0][3]+arr[0][4]+arr[0][5]==5){
//        ++cnt;
//    }
//  위에를 for문으로 다시 정리 하면,
        int row = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                row += arr[i][j];
            }
            if (row == 5) {
                ++cnt;
                row=0;
            }
        }


        //2.세로 줄이 빙고 일때
//         if (arr[0][0] + arr[1][0] + arr[2][0] + arr[3][0] + arr[4][0] == 5) {
//             ++cnt;
//         }
//         if (arr[0][1] + arr[1][1] + arr[2][1] + arr[3][1] + arr[4][1] == 5) {
//             ++cnt;
//         }
//         if (arr[0][2] + arr[1][2] + arr[2][2] + arr[3][2] + arr[4][2] == 5) {
//             ++cnt;
//         }
//         if (arr[0][3] + arr[1][3] + arr[2][3] + arr[3][3] + arr[4][3] == 5) {
//             ++cnt;
//         }
//         if (arr[0][4] + arr[1][4] + arr[2][3] + arr[3][4] + arr[4][4] == 5) {
//             ++cnt;
//         }

        // 일정 규칙으로 반복되니 for문으로 만들어준다.

        int columnn=0; //같은 세로줄의 합을 더해주는 그릇을 만들어준다.
        for(int i=0;i< arr.length; i++){
            for(int j=0;j< arr.length; j++){
                columnn +=arr[j][i];
            }
            if(columnn==5) ++cnt; columnn=0;// 한 세로줄의 합이 5면 빙고 카운트
        }


        //3.대각선 줄이 빙고 일때
        // if (arr[0][0] + arr[1][1] + arr[2][2] + arr[3][3] + arr[4][4] == 5) ++cnt;
        //이걸 for 문으로 줄이면

        //대각선의 합을 담아주는 그릇을 만들어준다.
        int cross=0;
        for(int i=0; i< arr.length; i++){
            cross+=arr[i][i];
        }
        if(cross==5) ++cnt;
        //4. 역 대각선이 빙고 일때
        // if (arr[0][4] + arr[1][3] + arr[2][2] + arr[3][1] + arr[4][0] == 5) ++cnt;
        //for 문으로 줄이면
        int reverseCross=0;

        for(int i=0; i< arr.length; i++){
            reverseCross+=arr[i][4-i];
        }
        if(reverseCross==5) ++cnt;




        return cnt;// 카운트한 수를 도출해낸다.


    }



    @Test
    public void bingoCountTest0(){
        int[][] arr = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };



        assertTrue((bingoCount2(arr)==0));
    }





    @Test
    public void bingoCountTest1(){


        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
        };
        assertTrue(bingoCount2(arr) == 12);

    }
    @Test
    public void bingoCountTest2(){
        int[][] arr = {
                {1,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };



        assertTrue((bingoCount2(arr)==0));
    }

    @Test
public void bingoCountTest3(){
        int[][] arr = {
                {1,1,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };

        assertTrue(bingoCount2(arr)==0);
    }

    @Test
    public void bingoCountTest4(){

        int[][] arr = {
                {1,1,1,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };

        assertTrue(bingoCount2(arr)==0);
    }

    @Test
    public void bingoCountTest5(){
        int[][] arr = {
                {1,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
      assertTrue(bingoCount2(arr)==0);
    }
    @Test
    public void bingoCountTest6(){
        int[][] arr = {
                {1,1,1,1,1},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==1);
    }
    @Test
    public void bingoCountTest7(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==1);
    }
    @Test
    public void bingoCountTest8(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==1);
    }
    @Test
    public void bingoCountTest9(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==1);
    }
    @Test
    public void bingoCountTest10(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==2);
    }
    @Test
    public void bingoCountTest11(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==2);
    }    @Test
    public void bingoCountTest12(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==2);
    }    @Test
    public void bingoCountTest13(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==2);
    }    @Test
    public void bingoCountTest14(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==2);
    }
    @Test
    public void bingoCountTest15(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==3);
    }
    @Test
    public void bingoCountTest16(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==3);
    }
    @Test
    public void bingoCountTest17(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==3);
    }
    @Test
    public void bingoCountTest18(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==3);
    }
    @Test
    public void bingoCountTest19(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==3);
    }
    @Test
    public void bingoCountTest20(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==4);
    }
    @Test
    public void bingoCountTest21(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,0,0,0,0},
        };
        assertTrue(bingoCount2(arr)==6);
    }
    @Test
    public void bingoCountTest22(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,0,0,0},
        };
        assertTrue(bingoCount2(arr)==7);
    }
    @Test
    public void bingoCountTest23(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,0,0},
        };
        assertTrue(bingoCount2(arr)==8);
    }
    @Test
    public void bingoCountTest24(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,0},
        };
        assertTrue(bingoCount2(arr)==9);
    }





};



