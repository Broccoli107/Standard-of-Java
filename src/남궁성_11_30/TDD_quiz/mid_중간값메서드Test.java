package 남궁성_11_30.TDD_quiz;

import org.junit.Test;

import static org.junit.Assert.*;

public class mid_중간값메서드Test {
    static int mid( int a, int b, int c){
//가운데 값을 뽑아 낸다.ex mid(2,3,1)=2
        //중간값을 받는 int num 생성


        int num = 0;

        //중간값이 b일때
        if ((b > a && b < c) || (b < a && b > c)) {
            num = b;
        }
        //중간값이 c일때
        else if ((c > a && c < b) || (c < a && c > b)) {
            num = c;
        }
        //둘 다아닐때
        else {

            num = a;
        }

        return num;
    }

    @Test
    public void midTest(){
   assertTrue(mid(1,2,3)==2);
   assertTrue(mid(1,3,2)==2);

    }
    @Test
    public void midTest2(){
        assertTrue(mid(2,1,3)==2);
        assertTrue(mid(2,3,1)==2);

    }
    @Test
    public void midTest3(){
        assertTrue(mid(3,2,1)==2);
        assertTrue(mid(3,1,2)==2);

    }


}

