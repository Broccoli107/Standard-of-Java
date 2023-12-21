//package 남궁성_12_06._9단원_예제.Ex9_6;
//
//public class Ex9_6 {
//    public static void main(String[] args) {
//        남궁성_12_06._9단원_예제.Ex9_10.Card c1= new 남궁성_12_06._9단원_예제.Ex9_10.Card();
//        남궁성_12_06._9단원_예제.Ex9_10.Card c2= new 남궁성_12_06._9단원_예제.Ex9_10.Card();
//
//        System.out.println(c1.equals(c2));
//
//    }
//}
//
//
//class Card {
//    int num;
//    String kind;
//
//    Card (){
//        this(1, "Spade");
//    }
//    Card(int num, String kind){
//        this.num= num;
//        this.kind= kind;
//    }
//
//    //Object 클래스의 toString 을 오버라이딩
//    public String toString(){
//        return "num: "+num+ " kind: "+kind;
//    }
//    //equals 오버라이딩
//    public  boolean equals(Object obj){
//        // Object 타입이기 때문에 모든 타입이 들어올수 있기 때문에 일단 카드 타입으로 형변환이 가능한지 아니면 false;
//
//        if(!(obj instanceof 남궁성_12_06._9단원_예제.Ex9_10.Card)) //카드 타입이 아니면 비교해볼 필요도없다.
//            return false;
//
//
//        남궁성_12_06._9단원_예제.Ex9_10.Card c= (남궁성_12_06._9단원_예제.Ex9_10.Card)obj ;//obj에는 num과 kind가 없으므로 형변환
//
//
//        return (this.kind.equals(c.kind) && this.num==c.num);
//    }
//
//}