package 남궁성_12_06._9단원_예제.Ex9_10;

public class Ex9_10 {
    Card c = new Card( "Heart", 3);



}
final class Card {
    String kind;
    int num;

Card(){
    this ("Spade", 1);
}
Card (String kind,int num){
    this.kind =kind;
    this.num =num;
}


public String toString (){
    return "Kind="+kind+"num="+num;
}

}

