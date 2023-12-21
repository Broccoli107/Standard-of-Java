package 남궁성_12_20._12단원_연습문제;

class Card {


    enum Kind {CLOVER, SPADE ,HEART, DIAOMOND}
    enum Number {
        ACE, TWO ,THREE, FOUR, FIVE, SIX, SEVEN , EIGHT, NINE, TEN, JACK , QUEEN ,KING
    }
    Kind kind;
    Number num;

    Card (){
        this(Kind.SPADE, Number.ACE);
    }

    Card(Kind kind, Number num) {
        this.kind =kind;
        this.num= num;

    }
    public String toString(){
        return "[" +kind.name()+","+num.name()+"]";
    }

}

class Deck {
    final int CARD_NUM =Card.Kind.values()/*배열반환*/.length * Card.Number.values().length;
}

public class Ex_12_7 {
}
