package 남궁성_11_28.객체지향2_예제;

public class Ex7_21 {
}
class Product{
    int price ;
    int bonusPoint;

    Product(int prince){
        this.price=price;
        bonusPoint =(int)(price/10.0); //보너스는 제품가격의 10%
    }
}

class Tv extends Product {
    Tv(){
        super(100);
    }
    public String toString(){ return "Tv";}
}


