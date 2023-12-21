package 남궁성_12_01._7단원_예제;


abstract class Unit2 {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("멈춥니다.");
    }
}
interface Fightable{//인터페이스:추상메서드 집합  인터페이스의 모든 메서드는 public abstract. 예외없이
    void move(int x,int y );//추상메서드 :몸통이 없는 메서드  앞에 public abstract가 생략

    void attack (Fightable f);

    }

//이제 상속을 받아 몸통을 만들어준다.(구현을 해준다.)_
class Fighter extends Unit2 implements Fightable{
        public void move (int x, int y){
            System.out.println("+x+"+"+y+"+" 로 이동");
        }

        public void attack(Fightable f){
            System.out.println(f+"를 공격");
        }


    }
class FighterTest{
     public static void main(String[] args) {
         Fighter f = new Fighter();
         f.move(100, 200);
         f.attack(new Fighter());

     }

 }






















