package 남궁성_11_30.TDD_quiz;

public class mid_중간값메서드 {
    public static void main(String[] args) {

      int mid_num= mid(3,1,2);

//출력
        System.out.println(mid_num);
    }


// 세개의 정수를 받아서 중간값을 출력하는 min 메서드 정의
//입력: 3개의 정수
//출력: 정수
static int mid( int a, int b, int c){
//가운데 값을 뽑아 낸다.ex mid(2,3,1)=2
    //중간값을 받는 int num 생성


        int num = 0;


        if ((b > a && b < c) || (b < a && b > c)) {
            num = b;
        }
        else if ((c > a && c < b) || (c < a && c > b)) {
            num = c;
        }
        else {

            num = a;
        }

        return num;
    }


}
