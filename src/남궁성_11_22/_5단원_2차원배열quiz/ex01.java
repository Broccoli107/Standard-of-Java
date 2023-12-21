package 남궁성_11_22._5단원_2차원배열quiz;


//5x5크기의 2차원 배열에 별을 담고, 배열을 출력하시오.

public class ex01 {
    public static void main(String[] args) {

    char[][] star= new char [5][5];// 일단 별을 담을 2차원 배열을 만든다.

        for( int i=0; i<star.length; i++){
            for ( int j=0; j<star[i].length; j++){
                if( i==j || i+j==4){// 배열에  별이 들어가는 조건
                    star [i][j]='*';//조건에 맞게  배열에 별을 집어 넣어준다
                }
                else {
                    star[i][j]= ' '; //조건 안맞는건 공백처리
                }

                System.out.print(star[i][j]);//한 줄출력해준다.

                }
            System.out.println();//한 줄 출력해줬으니 띄어쓰기
            }


        }



            }





