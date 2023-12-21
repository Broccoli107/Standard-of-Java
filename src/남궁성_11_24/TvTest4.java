package 남궁성_11_24;


class Tv4{
    //Tv의 변수 (리소스)
    String color;
    boolean power;
    int channel;
//Tv 메서드 (역할)

    void power(){power=!power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}

}

    class TvTest4{
        public static void main(String[] args) {

        Tv4[] tvArr= new Tv4[3]; //배열생성 클래스이름이 같아야한다

        for (int i=0; i<tvArr.length; i++){
        tvArr[i]= new Tv4();
        tvArr[i].channel= i+10;

        }
        for (int i=0; i<tvArr.length;i++){
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
        }

    }
}
