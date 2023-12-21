package 남궁성_12_04._7단원_연습문제;


class OuterClass{
    class InnerClass {
        int iv =100;
    }
}







public class Ex7_25 {
    public static void main(String[] args) {
        OuterClass oc= new OuterClass();
        OuterClass.InnerClass ic= oc.new InnerClass();
        System.out.println( ic.iv);




    }


}
