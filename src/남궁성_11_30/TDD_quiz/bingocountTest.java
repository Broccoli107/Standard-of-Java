package 남궁성_11_30.TDD_quiz;

import org.junit.Test;

import static org.junit.Assert.*;

public class bingocountTest {
    static  int bingoCount(int [][]arr){
//빙고의 갯수를 세는 방법
//일단 갯수를 받는 cnt 변수 생성
        int cnt=0;

//가로 같을때

        int rowCount=0; //가로가 같을때 횟수를 받아주는 변수

        for(int i=0; i< arr[0].length;i++) {//같은 가로중
            for (int j = 0; j < arr[0].length - 1; j++) {//같은 가로줄에서 j 번째
                if (arr[i][j] == arr[i][j + 1] && arr[i][j]==1 ) { //arr[i][j]==1은 1로 표시된것만 빙고갯수로 세기위함
                    ++rowCount;
                }
            }

            if (rowCount == 4) {//가로 줄 한바퀴 돌때 같은 횟수가 4번이면 빙고
                ++cnt;
                rowCount=0;//이걸 안하면 계속 rowCount값은 4이므로 for문 돌때마다 cnt값이 올라감(디버깅의 중요성 디버깅해서 for문 돌때마다 cnt 올라가는걸 못보면 알기 힘듬)
            }
        }




//세로 같을때
//세로가 서로 같을때 횟수를 받아주는 변수
        int columnCount=0;

        for(int i=0; i< arr.length;i++){
            for( int j=0; j< arr.length-1; j++){
                if(arr[j][i]==arr[j+1][i] && arr[i][j]==1){
                    ++columnCount;
                }

            }
            if (columnCount==4) ++cnt; columnCount=0;
        }




//대각선 같을때
//1. 대각선 같을때
        int crossCount=0;
        for(int i=0; i< arr.length-1; i++){
            if(arr[i][i]==arr[i+1][i+1] && arr[i][i]==1){
                ++crossCount;
            }
        }
        if(crossCount==4) ++cnt; crossCount=0;


//2, 역 대각선 같을때

        int crossCount2=0;
        for(int i=0; i< arr.length-1; i++){
            if( arr[i][4-i]==arr[i+1][3-i] && arr[i][4-i]==1){
                ++crossCount2;
            }
        }
        if(crossCount2==4) ++cnt; crossCount2=0;




        return cnt;
    }


    @Test
public void bingCountTest(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
        };
        assertTrue(bingoCount(arr) == 12);

    }

    @Test
    public void bingCountTest2(){
        int[][] arr = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 0);

    }

    @Test
    public void bingCountTest3(){
        int[][] arr = {
                {1,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 0);

    }
    @Test
    public void bingCountTest4(){
        int[][] arr = {
                {1,1,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 0);

    }
    @Test
    public void bingCountTest5(){
        int[][] arr = {
                {1,1,1,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 0);

    }    @Test
    public void bingCountTest6(){
        int[][] arr = {
                {1,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 0);

    }    @Test
    public void bingCountTest7(){
        int[][] arr = {
                {1,1,1,1,1},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 1);

    }    @Test
    public void bingCountTest8(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 1);

    }    @Test
    public void bingCountTest9(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 1);

    }    @Test
    public void bingCountTest10(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 1);

    }    @Test
    public void bingCountTest11(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 1);

    }
    public void bingCountTest12(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 2);

    }
    public void bingCountTest13(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 2);

    }
    public void bingCountTest14(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 2);

    }
    public void bingCountTest15(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 2);

    }
    public void bingCountTest16(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 2);

    }
    public void bingCountTest17(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 3);

    }
    public void bingCountTest18(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 3);

    }
    public void bingCountTest19(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 3);

    }
    public void bingCountTest20(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,0,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 3);

    }
    public void bingCountTest21(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,0},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 3);

    }
    public void bingCountTest22(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {0,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 4);

    }


    public void bingCountTest23(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,0,0,0,0},
        };
        assertTrue(bingoCount(arr) == 6);

    }
    public void bingCountTest24(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,0,0,0},
        };
        assertTrue(bingoCount(arr) == 7);

    }
    public void bingCountTest25(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,0,0},
        };
        assertTrue(bingoCount(arr) == 8);

    }
    public void bingCountTest26(){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,0},
        };
        assertTrue(bingoCount(arr) == 9);

    }












}