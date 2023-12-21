package 남궁성_11_20.연습문제03단원;

public class ex01 {
    public static void main(String[] args) {
        int x=2;
        int y=5;
        char c='A';//'A'의 문지코드는 65


        System.out.println(1 + x << 33);
        System.out.println(y >= 5 || x < 0 && x > 2);//y는 5 이미 앞에서 true이니 true
        System.out.println(y += 10 - x++);// 풀어쓰면 y=y+(10-x++) 이때 x++는 후위형이기 때문에 10-2로 계산후, x는 3으로 증가
        // 된다. 그러므로 y=5+8이므로 13이된다.




        System.out.println(x+=2);//x는 3그대로 이다 그래서 x+=2는 5
        System.out.println( !('A' <= c && c <='Z') );//느낌표안에는 true 이니 false
        System.out.println('C'-c); // 2글자 차이 이니 2
        System.out.println('5'-'0'); //이것도 5
        System.out.println(c+1);//66 문자+정수는 정수
        System.out.println(++c);//증감연산자쓰면 그냥 문자 B
        System.out.println(c++);//B
        System.out.println(c);//C





    }
}
