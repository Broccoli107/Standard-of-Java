package 남궁성_11_30._포커카드quiz;

//풀하우스 빼곤 다했습니다.



//1. 카드 객체 만들기

class Card{
    int num;
    String kind;

Card (String kind, int num){
    this. kind=kind;
    this. num=num;
}

}



class Test{
    public static void main(String[] args) {


        //카드 5장  배열 만들기
        Card[] cardArr = new Card[5];
        //각 배열에 들어가는 객체 초기화

        cardArr[0] = new Card("S",1 );
        cardArr[1] = new Card("H",2 );
        cardArr[2] = new Card("H",2 );
        cardArr[3] = new Card("H",4 );
        cardArr[4] = new Card("H",4 );
//반복되니 for문으로 고친다.
//        for(int i=0; i< cardArr.length; i++){
//            cardArr[i]= new Card("H",i+1);
//        }

//2.rankCheck 메서드 실행
        String result =rankCheck(cardArr);
//3.결과 출력
        System.out.println("result="+result);

    }
//rankCheck 메서드
//매개변수 타입: Card 타입 배열
//출력 타입: 문자열
//기능: 각 카드를 봐서 포커의 랭크를 확인하는 메서드
  static  String rankCheck( Card[] cardArr){
        //랠크 체크 해야할 목록
        //1 pair, 2pair, three card, four card, full house, straight, flush가있다.
        //우리는 일단 가장 쉬운 flush 부터 구현하자
        //그다음에 쉬운 1pair


      int flush_Cnt=0;
      for (int i = 1; i <= 4; i++) {
          if(cardArr[0].kind==cardArr[i].kind)
              flush_Cnt++;
      }

      if(flush_Cnt==4) {return "FLUSH";}
//그 다음 으로는 풀 하우스 ex)2,2,3,,3,3 같은 숫자가 2개 다른 같은 숫자가 3개 one pair 와 three card의 교집합
//힌비퀴 돌때 같은 숫자를 세는 count가 1이면 같은 숫자가 2개 있다는 의미이고 2이면 같은숫자가 3개있다는 의미




//1pair (숫자 하나씩 비교해서 같은게 1개면 1pair)

//      if( cardArr[0].num==cardArr[1].num|| cardArr[0].....
//           cardArr[1].num==cardArr[2]|| cardArr[1]==cardArr[2].num...... )
      //반복되니 for문으로 묶어주자


     int onePair_Cnt=0;
       for( int i=0; i< cardArr.length; i++){
            for (int j=i+1; j< cardArr.length; j++){
                if (cardArr[i].num==cardArr[j].num){
                    onePair_Cnt++;
                }
            }
        }
      if(onePair_Cnt==1) return "1 pair";

      //그 다음으로 쉬운 2 pair 2pair는 아까와 같이 하나씩 비교해보고 cnt가 2면 2 pari이다.

      int twoPair_Cnt=0;
      for( int i=0; i< cardArr.length; i++){
          for (int j=i+1; j< cardArr.length; j++){
              if (cardArr[i].num==cardArr[j].num){
                  twoPair_Cnt++;
              }
          }
      }
      if(twoPair_Cnt==2) return "2 pair";


    // 한번 for문 돌떼 같은 횟수가 3번이면 four card

      //three카드가 먼저 출력되므로 순서를 바꾸자

      int fourCount=0;

      for( int i=0; i< cardArr.length; i++) {
          for (int j = i + 1; j < cardArr.length; j++) {
              if (cardArr[i].num == cardArr[j].num) {
                  ++fourCount;
              }

          }

          if (fourCount == 3){return "four card";}
          fourCount=0;//한바퀴 돌고나서 다시 카운트는 0으로 초키화

      }



      //그 다음은 three card 같은 숫자카드 3개면  three 카드이다. ex 1,1,1,3,5
      //for 문 한번 돌때 같은 횟수가 2번이면 three card
 int threeCount=0;
      for( int i=0; i< cardArr.length; i++) {
          for (int j = i + 1; j < cardArr.length; j++) {
              if (cardArr[i].num == cardArr[j].num){
                          ++threeCount;
              }

          }

          if(threeCount==2) {return "three card";}
          threeCount=0;

      }



      //숫자가 연속으로 나올때 straight ex)1,3,4,5,2 숫자를 크기순으로 정렬 후, if문 조건으로 0번째+1이 첫번쨰, 0번쨰+2가 두번째.....
      //이렇게 확인하면 될것같다. 순서대로 배열을 해야 하니 맨밑에 작성

      for(int i=0; i< cardArr.length-1; i++) {//몇 바퀴를 돌려야하는지
          for (int j = 0; j < cardArr.length - 1 - i; j++) {   //한 번 돌떄 숫자를 서로 몇번 비교를 해야하는지

              if (cardArr[j].num > cardArr[j + 1].num) {
                  int tmp = cardArr[j].num;
                  cardArr[j].num = cardArr[j + 1].num;
                  cardArr[j + 1].num = tmp;
              }
          }
      }
    //순서대로 배열 후, 첫번째꺼 1더한게 두번째눈 첫번쨰 1더한게 .......

       int straightCount=0;
        for (int i=0; i< cardArr.length-1; i++) {
            if (cardArr[i].num + 1 == cardArr[i+1].num) {
                    ++straightCount;
            }

        }
      if(straightCount==4){ return "straight";}

        straightCount=0;



      return "NO Rank";
    }
}


