package 남궁성_12_04.Ex7_23;

import java.util.Vector;
//4.메서드를 테스트 해본다.
public class Ex7_23 {
    public static void main(String[] args) {

        Buyer  b= new Buyer();
        //원래는 다 Product  p로 객체를 생성할 수있지만 각 물건을 사고 환볼하고 해야하기 때문에 이렇게 한다.
        Tv tv= new Tv();
        Computer com= new Computer();
        Audio audio= new Audio();

        b.buy(tv);
        b.buy(com);


        b.Summary();
        b.refund(com);
        System.out.println();
        b.Summary();


    }
}
//1. Product 클래스 만들기

class Product {
    int price;
    int bonusPoint;
//가격이랑 보너스 점수 생성자 추가
    Product (int price){
        this.price=price;
    bonusPoint=(int)( price/10.0);
    }
    Product(){}
}
//2. Product의 상속을 받는 Tv, Computer,Audio 클래스 만들기
class Tv extends Product{

    Tv(){
        super(100);
    }
public String toString(){
        return "Tv";
}
}

class  Computer extends Product{
    Computer(){
        super(200);
    }

    public String toString(){
        return "Computer";
    }

}

class Audio extends Product{
    Audio(){
        super(50);
    }

    public String toString(){
        return "Audio";
    }

}


//3. 잔액이 부족한지, 돈이 얼마남았는지, 보너스점수는 몇점인지,계산해주는 매서드랑 환불해주는 메서드를 만든다.


class Buyer{
int money= 1000;
int bonusPoint=0;
Vector item= new Vector();
void buy ( Product p){
    if (money < p. price){
        System.out.println( "잔액이 부족하여 물건을 살 수없습니다.");
        return;
    }
money-=p.price;
bonusPoint += p.bonusPoint;
item.add(p);
    System.out.println( p +"을/를 구입하셨습니다.");

}

void refund (Product p){
    if( item.remove(p)){
        money+= p.price;
        bonusPoint-=p.bonusPoint;
        System.out.println(p+"을/를 반품하셨습니다.");
    }

else {
        System.out.println( "구입하신 물품중 해당 제품이 없습니다.");
    }

}

void Summary(){
    int sum=0;
    String itemList="";


if(item.isEmpty()){
    System.out.println( "구입하신 제품이 없습니다.");
    return;
}

for (int i=0; i<item.size(); i++){
    Product p= (Product) item.get (i);
    sum += p.price;
    itemList += (i==0) ? ""+p : ","+p;
}

    System.out.println("구입하신 물품의 총금액은"+ sum + "만원입니다.");
    System.out.println("구입하신 제품은 "+itemList+"입니다.");




}


}