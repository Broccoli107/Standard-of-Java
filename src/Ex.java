import java.util.ArrayList;

public class Ex {
    public static void main(String[] args) {

        Cal c =new Cal();
        c.x=10;
        c.y=20;
        System.out.println(c.add());


    }
}


class Cal {
    int x;
    int y;

    int add () {
    return x+y;
    }

}