package 남궁성_12_14;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_30 {
    public static void main(String[] args) {


        HashMap map =new HashMap();

        map.put ("myId", "1234");//HashMap은 (키,값)으로 저장한다. 키는 중복이 허용되지 않지만, 값은 중복이 허용된다.
        map. put("asdf", "1111");
        map. put ("asdf", "1234");//asdf 1234가 출력된다.

        Scanner s =new Scanner(System.in);//화면에서 데이터를 받아올꺼니까 Scanner 객체 생성


        while (true) {
            System.out.println( "id와 password를 입력해주세요");
            System.out.println( "id: ");
            String id =s.nextLine().trim(); //화면에서 한 줄씩 그리고 공백을 지우고 받아온다.
            System.out.println("password: ");
            String password = s.nextLine().trim();
            System.out.println();
            if (!map.containsKey(id)){ //HashMap에 저장된 key의 값이 있는지 알아본다.
                System.out.println("입력하신 id는 존재하지 않습니다.  다시 입력해주세요. ");
                continue;
            }


            if (!map.get(id).equals(password) ){
                System.out.println("비밀번호가 일치하지 않습니다. 다시입력해주세요");

            }else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }

        }










    }
}
