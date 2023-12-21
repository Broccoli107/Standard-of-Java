package 남궁성_12_13._11단원_예제;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_10 {
    public static void main(String[] args) {

        if ( args.length !=1){
            System.out.println();
        }
        Stack st = new Stack();
        String expression = args[0]; //화면에서  식을 문자열로 받아온다

        System.out.println("expression:" +expression);
        try {
            for ( int i=0 ; i<expression.length(); i++){
                char ch= expression.charAt(i);

                if(ch=='('){
                    st.push(ch+""); //여는 괄호가 있다면 그걸 스택에 집어넣는다.

                } else if (ch==')') {   //닫는 괄호가 있다면 여는 괄호를 스택에서 뽑아낸다.
                    st.pop();
                }

            }
            if(st.isEmpty()){
                System.out.println("괄호가 일치합니다.");

            }else {
                System.out.println("괄호가 일치하지 않습니다."); //괄호가 stack에 남아있다면 출력
            }
        }catch (EmptyStackException e){ //비어있는 상태에서 꺼낿때 발생하는 예외
            System.out.println( "괄호가 일치하지 않습니다.");
        }






    }
}
