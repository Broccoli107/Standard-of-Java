package 남궁성_11_24;


class Card{
    String kind;
    int number;
    static int width=100;
    static int height=250;

}

class CardTest{
    public static void main(String[] args) {
        System.out.println("Card.width="+ Card.width);  //클래스 변수는 객체생성 필요없고
        System.out.println("Card.height="+ Card.height);

        Card c1= new Card();
        Card c2= new Card();

        c1.kind="Heart";
        c1.number=7;
        c2.kind="spade";
        c2.number=4;

        System.out.printf("c1은 %s, %d이며, 크기는 (%d, %2d)", c1.kind,c1.number,Card.width, Card.height);
        System.out.println();
        System.out.printf("c2은 %s, %d이며, 크기는 (%d, %2d)", c2.kind,c2.number,Card.width, Card.height);
        System.out.println();
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");

        Card.width=50;
        Card.height=80;

        System.out.printf("c1은 %s, %d이며, 크기는 (%d, %2d)", c1.kind,c1.number,Card.width, Card.height);
        System.out.println();
        System.out.printf("c2은 %s, %d이며, 크기는 (%d, %2d)", c2.kind,c2.number,Card.width, Card.height);
        System.out.println();


    }
}