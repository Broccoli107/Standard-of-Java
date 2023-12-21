package 남궁성_12_04._7단원_연습문제;



    public class Ex7_1 {
        public static void main(String[] args) {
            SutdaDeck deck = new SutdaDeck();

            for (int i = 0; i < deck.cards.length; i++) {
                System.out.print(deck.cards[i] + ", ");
            }

        }


    }

    class SutdaDeck {
        final int CARD_NUM = 20;
        SutdaCard[] cards = new SutdaCard[CARD_NUM];

        SutdaDeck() {
            // 1,3,8일때 집어넣어야할때
//        cards[0]=new SutdaCard (1,true);
//        cards[1]=new SutdaCard(2, false);
//        cards[2]= new SutdaCard(3, true);
//        cards[3]=new SutdaCard(4,false);
//              //  .......
//
//        cards[9]= new SutdaCard(10, false);
//                for( int i=0; i< cards.length/2; i++){

            for (int i = 0; i < cards.length / 2; i++) {
                if (i == 0 || i == 2 || i == 7) {
                    cards[i] = new SutdaCard(i + 1, true);
                }
                else {
                    cards[i] = new SutdaCard(i + 1, false);
                }
            }

//    //그냥 1부터 10 집어넣을때
//        cards[10]= new SutdaCard(11, false);
//        cards[11]= new SutdaCard(12, false);
//.........
//쉬운것 부터 먼저하면,
            for (int i = 10; i < cards.length; i++)
                cards[i] = new SutdaCard(i - 9, false);

        }


    }

    class SutdaCard {
        int num;
        boolean isKwang;

        SutdaCard() {
            this(1, true);
        }

        SutdaCard(int num, boolean isKwang) {
            this.num = num;
            this.isKwang = isKwang;
        }

        public String toString() {
            return num + (isKwang ? "k" : " ");
        }
    }



//    //그냥 1부터 10 집어넣을때
//        cards[10]= new SutdaCard(11, false);
//        cards[11]= new SutdaCard(12, false);
//.........
//쉬운것 부터 먼저하면,


