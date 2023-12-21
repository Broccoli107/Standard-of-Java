package 남궁성_12_13._11단원_예제;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ex11_11 {
    static Queue q= new LinkedList();
    static final int MAX_SIZE = 5;

     public static void main(String[] args) {


         while (true){
             System.out.println(">>");
             try {
                 Scanner s = new Scanner(System.in);//화면으로부터 데이터를 받아올꺼니
                 String input = s.nextLine().trim(); //화면에서 한 줄씩 받아온다는 의미
                if ("".equalsIgnoreCase("q")){
                 System.exit(0);
                }else if(input.equalsIgnoreCase("help")){
                    System.out.println("help - 도움말을 보여줍니다.");
                    System.out.println("q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println("histoty"); //이전에 친 모든 문자열을 출력
                }else if ( input.equalsIgnoreCase("history")) {
                    save(input); //명령어를 저장
                    LinkedList list = (LinkedList) q;



                    final int SIZE= list.size();
                    for (int i =0; i<SIZE ; i++)
                        System.out.println((i+1)+"."+ list.get(i) ); //큐에 있는 객체를 반환해서 출력 큐 형태라 처음저장한게 처음에 출력된다.
                }else {
                    save (input);
                    System.out.println(input);//다른 문자는 그냥 출력
                }

                 }catch(Exception e){
                 System.out.println("입력오류입니다.");


             }



         }


     }

    public static void save (String input) {

         if( !"".equals(input)) // 빈문자열이 아니면 큐에 저장  저렇게 비교하는 이유는 원래는 if( !input.equals("")||input!=null)) 인데 input이 null일때 null.equals()
             // nullpointException이 일어난디. null은 아무런 값도 없기 떄문에 메소드를 호출할 객체 자체가 없다.
            q.offer(input);



         if( q.size() >MAX_SIZE) //큐의 크기를 넘어가면 맨 밑에꺼 삭제
             q.remove();


     }





}
