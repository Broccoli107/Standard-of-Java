package 남궁성_12_04.Ex7_26;

public class Ex7_26 {
}
class Unit {
    int hitPoint;
    final  int MAX_HP;

    Unit (int hp){
        MAX_HP=hp;
    }
}

interface Repairable {}
class GroundUnit extends Unit {
    GroundUnit (int hp){
        super (hp);
    }
}

class AirUnit extends Unit {
    AirUnit ( int hp){
        super( hp);
    }
}


class Tank extends GroundUnit implements Repairable{
    Tank (){
        super(150);//탱크 체력은 150으로 초기화
        hitPoint = MAX_HP;
    }



    public String toString(){
        return "Tank";
    }
}
class Dropship extends AirUnit implements Repairable{
    Dropship(){
        super(125);
        hitPoint = MAX_HP;
    }

public String toString(){
        return  "Dropship";
}

}

class Marine extends GroundUnit {
    Marine (){
        super(40);
        hitPoint =MAX_HP;
    }
}

class SCV extends GroundUnit implements Repairable{
    SCV(){
        super (60);
        hitPoint = MAX_HP;
    }

    void repair( Repairable r){ //Repairable 인터페이스로 묶어서 수리릏 가능하게 만듦. 매개변수가 인터페이스 그 뜻은 인터페이스 구현한 객체만 들어와라 라는 의미
        //인터페이스는 어떻게 보면 조
        if( r instanceof Unit) {
            Unit u = (Unit) r;

            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }

}


