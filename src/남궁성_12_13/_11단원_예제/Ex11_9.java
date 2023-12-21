package 남궁성_12_13._11단원_예제;

import java.util.Stack;

public class Ex11_9 {
    public static Stack back = new Stack();
    public static Stack forward= new Stack();


    public static void main(String[] args) {

        goURL("1.네이트");
        goURL("2.야후");
        goURL("3.네이버");
        goURL("4..다음");
        printStatus();






    }

public static void printStatus () {
    System.out.println( "back:" +back);// 참조변수로 적어도 stack은 배열로 출력되도록 오버라이딩 되어있다.
    System.out.println("forward:" + forward);
    System.out.println("현재화면은 '"+back.peek()); //stack에 맨위 객체를 반환 stack 객체수에는 변화가 없음
    System.out.println();
    }
    public static void goURL (String url){
        back.push(url);
        if(!forward.empty())
            forward.clear();
    }

    public static void goFoward (){
        if(!forward.empty())
            back.push(forward.pop());
    }
    public static void goBack(){
        if (!back.empty())
            forward.push(back.pop());
    }




}
