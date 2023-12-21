package 남궁성_11_22._5단원_연습문제;

public class ex5_8 {


    public static void main(String[] args) {


        //1.각 숫자가 몇개있는지 구한다.
        //2. 그 숫자의 갯수 만큼 별을 찍어준다.

        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];
        for (int i = 0; i < answer.length; i++) {

          counter[answer[i]-1]++;//숫자의 갯수만큼 카운터 배열안에 값이 더해진다 그래서 나중에
            // counter 배열의 값을 불러오면 몇개있는지 알 수있다.


        }
        for (int i = 0; i < counter.length; i++) {
            System.out.print(i+1);//앞에 숫자를 적어준다.
            int j=0;
            while (j<counter[i]){ //카운팅된 갯수 까지 while문으로 별을 찍어준다.
                System.out.print("*");
            j++;
            }

            System.out.println();
        }

    }
}