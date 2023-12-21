package 남궁성_11_28;
//5장의 카드를 받아서 랭킹을 문자열로 변환하는 rankCheck() 작성하시오


import java.util.Arrays;

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



class DeckTest {
    public static void main(String[] args) {


        // 카드 배열 생성
        Card[] cardArr = new Card[5];//길이가 5인배열 각 배열안에 숫자와 종류 를 집어넗는다.


        for (int i = 0; i < cardArr.length; i++) {

            int randomKind = (int) (Math.random() * Card.KIND_MAX);
            int randomNum = (int) (Math.random() * Card.NUM_MAX);
            cardArr[i] = new Card(randomKind, randomNum);
        }

        // 2. rankCheck 메서드 호출
        String result = rankCheck(cardArr);

        // 3. print result
        System.out.println("result = " + result);
        for( int i=0; i< cardArr.length;i++){
            System.out.printf(" %2d",cardArr[i].num );
        }
    }

    static String rankCheck(Card[] cardArr) {

        if (cardArr[0].kind == cardArr[1].kind && cardArr[1].kind == cardArr[2].kind &&
                cardArr[2].kind == cardArr[3].kind && cardArr[3].kind == cardArr[4].kind)
            return "flush";

        for (int i = 0; i < cardArr.length; i++) {

        }

        for (int i = 0; i < cardArr.length; i++) {
            for (int j = i + 1; j < cardArr.length; j++) {
                for (int k = j + 1; k < cardArr.length; k++) {
                    for (int l = k + 1; l < cardArr.length; l++) {
                        if (cardArr[i].num == cardArr[j].num && cardArr[j].num == cardArr[k].num && cardArr[k].num == cardArr[l].num) {
                            return "four card";
                        }
                    }
                }
            }
        }
                    for (int i = 0; i < cardArr.length; i++) {
                        for (int j = i + 1; j < cardArr.length; j++) {
                            for (int k = j + 1; k < cardArr.length; k++) {
                                if (cardArr[i].num == cardArr[j].num && cardArr[j].num == cardArr[k].num) {
                                    return "three card";
                                }

                            }
                        }
                    }

                    for (int i = 0; i < cardArr.length; i++) {
                        for (int j = i + 1; j < cardArr.length; j++) {
                            if (cardArr[i].num == cardArr[j].num)
                                return "1 pair";
                        }
                    }


                    return "No Rank";


                }
            }


