package 남궁성_12_04.Ex7_21;

public class Ex7_21 {
    public static void main(String[] args) {

    Buyer b= new Buyer();
    b.buy( new Tv());// Product p = new Tv();
    b.buy( new Computer());
        System.out.println( "현재 남은 돈은 "+ b.money +"만원입니다.");
        System.out.println( "현재 보너스 점수는 "+b.bonusPoint +"점 입니다.");
    }

}


//Product의 클래스 정의
class Product {
    int price;
    int bonusPoint;
//생성자 생성
Product (int x){
    this.price =x;
    this.bonusPoint=(int) (price/10.0); //보너스 점수는 제품가격의 10%
}

}


class Tv extends Product{
    Tv(){
        super(100);//조상의 생성자를 불러서 Tv 가격을 100으로 초기화
    }
    public String toString(){ //Object 클래스의 toString을 오버라이딩 한다.
        return "Tv";
    }


}


class Computer extends Product{
    Computer(){
        super( 200);// Computer 가격을 200으로 초기화
    }
    public String toString(){
        return "Computer";
    }
}

class  Buyer{
    int money = 1000;

    int bonusPoint= 0;



    void buy ( Product p){
        if ( money <p.price){
            System.out.println( "잔액이 부족하여 물건을 살 수  없습니다.");
            return;
        }
        money-=p.price;
        bonusPoint+=p.bonusPoint;
        System.out.println(p+ "을/를 구입하셨습니다.");
    }


}