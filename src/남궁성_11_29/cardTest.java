package 남궁성_11_29;
//1.card배열 만들기

//2.rankCheck()메서드 실행
//3.출력
public class cardTest {
}
//1.카드 클래스 생성

class Card {
    static final int KIND_MAX = 4; // 카드 무늬의 수
    static final int NUM_MAX = 13; // 무늬별 카드의 수

    static final int SPADE =3 ;
    static final int DIAMOND = 2;
    static final int HEART = 1;
    static final int CLOVER = 0;
    int num;
    int kind;
    Card(){}

    Card(int kind, int num){ //생성자 생성
        this.kind=kind;
        this.num=num;
    }



}
//2.카드를 묶은 덱을 생성
