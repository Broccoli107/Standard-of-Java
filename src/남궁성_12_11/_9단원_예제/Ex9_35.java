package 남궁성_12_11._9단원_예제;

import java.util.Scanner;

public class Ex9_35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// 화면에서 바
        String[] argArr= null;
        while (true){
            String prompt =">>";
            System.out.print(prompt);

            String input= s.nextLine(); //사용자로부터 한줄의 입력을 받아온다. 만약 화면에 hello를 치면 여기에 처음으로 저장이된다.
            input = input.trim();//입력받은 문자열 앞뒤의 공백을 제거한다.
            argArr= input.split ( " +");//공백을 기준으로 나눠서 배열에 집어넣는다.
            String command = argArr[0]
;
            if ("".equals(command)) continue; //빈문자열이면 처음으로 돌아간다. continue는 반복뮨 꿑으로가서 다음 반복을 시작한다.



            command= command.toLowerCase();
            if (command.equals("q")) {
                System.exit(0);
            }else {
                for (int i = 0; i < argArr.length; i++)
                    System.out.println(argArr[i]);
            }


        }
    }
}
