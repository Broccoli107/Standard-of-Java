package 남궁성_12_04._7단원_연습문제.Ex7_2;


import java.util.Arrays;

public class Ex7_2 {
    public static void main(String[] args) {
        SutdaDeck s= new SutdaDeck();
        System.out.println(s.pick(0));
        System.out.println(s.pick());
        s.shuffle();

        for ( int i =0; i<s.cards.length; i++)
            System.out.print(s.cards[i]);
        }


    }


class SutdaDeck {
    final  int CARD_NUM=20;
    SutdaCard[] cards =new SutdaCard[CARD_NUM];
SutdaDeck(){
    for (int i =0; i< cards.length/2; i++){
        if( i==0 || i==2 || i==7){
            cards[i]= new SutdaCard(i+1, true);
        }
        else {
            cards [i]= new SutdaCard(i+1, false);
        }
    }

    for ( int i =10; i< cards.length; i++){
        cards[i]= new SutdaCard(i-9, false);
    }

}


//메서드명 : shuffle
// 기능: 배열 cards에 담긴 카드의 위치를 뒤섞는다.
//반환타입: 없음
//매개변수 없음


void shuffle () {
    for (int i = 0; i < cards.length; i++) {
        int j = (int) (Math.random() * cards.length);
        SutdaCard tmp = cards[i];
        cards[i] = cards[j];
        cards[j] = tmp;
    }
}
//메서드명: pick
// 배열 cards 에서 지정된 위치의 SutdaCard 를 반환한다.
//반환타입: SutdaCard
//매개변수 : int index

SutdaCard pick (int index){
//유효성 검사
    if( index>=cards.length| index<0)
        return null;

      else  return cards[index];

    }

//메서드명 pick
//배열 cards 에서 임의의 위치의 SutaCard를 반환한다.
//반환타입 SutadaCard
//매개변수 : 없음
SutdaCard pick () {
    int i = (int)(Math.random()* cards.length);
   return   cards[i];
}
}







class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard(){
        this(1,true);
    }
    SutdaCard (int num, boolean isKwang){
        this.num= num;
        this.isKwang= isKwang;
    }

public String toString (){ //이런걸 하는이유 : 우리는 내용을 알고 싶지 객체의 classd의 이름과 주소는 알고싶지않으니 오버라이딩 하는거다.
        return num +(isKwang ? "k" :"");
}

}
