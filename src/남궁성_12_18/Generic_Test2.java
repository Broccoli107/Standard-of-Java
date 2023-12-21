package 남궁성_12_18;

import java.util.ArrayList;

class Tv{}
class Audio{}
public class Generic_Test2 {
    public static void main(String[] args) {

        ArrayList<Tv> list = new ArrayList<Tv>();
        list.add(new Tv());
//        list.add(new Audio());  Audio는 저장이 안된다. 왜냐하면 Tv타입으로 지정헀기 때문이다.


        Tv t =list.get(0); //에전에는 get으로 객체를 생성하면 타입이 Object라 따로 형변환을 해서 저장을 해야헀는데
        //지네릭스를 이용하면 따로 형변환을 안해서 코드가 간결하다는 장점이 있다.
        //






    }
}
