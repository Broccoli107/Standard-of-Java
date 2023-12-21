package 남궁성_12_01._7단원_예제;

public class Ex7_3 {//이제 테스트를 해봅시다

    public static void main(String[] args) {

        Deck d= new Deck();

        System.out.println(d.pick());
    }

}

//1.카드 클래스 생성
//2.카드 뭉치인 덱 생성
//3.카드 셔플 후 첫번쨰 장 그리고 몇번쨰의 카드를 봅는 메서드를 생성
//테스트 및 결과 값 도출





//1.카드 클래스 만들기
class card{
    int num;
    int kind;

    static final int KIND_MAX=4;
    static final int NUM_MAX=13;
    static final int SPADE=4;
    static final int DIAMOND=3;
    static final int CLOVER=2;
    static final int HEART=1;
    card(int num, int kind){
    this.num= num;
    this.kind= kind;
}

public String toString(){
        String[] kinds={"","HEART","CLOVER","DIAMOND","SPADE"};
        String numbers="0123456789XJQK" ;//10은 X로

    return "kind="+ kinds[this.kind]+"   number=" +numbers.charAt(this.num);

    }

}

//2.덱 만들기
class Deck {

//덱이라는 배열 안에 카드를 집어넣는다. 그러면 배열의 갯수는 카드의 갯수 53

    card[] cardArr = new card[52];

    Deck() {
//    cardArr[0]=new card();
//    cardArr[0].num=1;
//    cardArr[0].kind="H";
//    cardArr[1]=new card();
//    cardArr[1].num=2;
//    cardArr[1].kind="H";
//    cardArr[2]=new card();
//    cardArr[2].num=3;
//    cardArr[2].kind="H"; 이렇게 일일이 집어넣을수 있겠지만, 생성자와 for문을 통해서 이걸 줄이자.
//    일단 위에 생성자 부터 생성  그다음 for 문
//   이렇게 하면 H일때 배열을 배열 0-12까지 S 일떄 13-25 이렇게 되니 그냥 종류도 정수형태로 놓자.


        int i = 0;
        for (int j = 1; j <= card.KIND_MAX; j++)
            for (int k = 0; k < card.NUM_MAX; k++) {
                cardArr[i++] = new card(k + 1, j);
            }
    }

    //셔플 메서드
    void shuffle() {
//      int n=(int)(Math.random()*cardArr.length);
//        card tmp= cardArr[0];
//        cardArr[0]=cardArr[n];
//        cardArr[n]= tmp;
        //이걸 배열 길이만큼 반복한다.

        for (int i = 0; i < cardArr.length; i++) {

            int n = (int) (Math.random() * cardArr.length);
            card tmp = cardArr[0];
            cardArr[0] = cardArr[n];
            cardArr[n] = tmp;


        }
//a 번쨰 뽑는 메서드

    }


    card pick(int a) {

        return cardArr[a];
    }
//

    card pick() {
        int b = (int) (Math.random() * cardArr.length);

        return cardArr[b];
    }
//5장을 배열을 뽑는 메서드

    card[] draw() {
        card[] drawncard = new card[5];
        for (int i = 0; i <= 5; i++) {

            drawncard[i] = cardArr[i];

        }
        return drawncard;



    }
}








