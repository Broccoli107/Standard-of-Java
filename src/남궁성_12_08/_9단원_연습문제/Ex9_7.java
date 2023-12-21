package 남궁성_12_08._9단원_연습문제;

public class Ex9_7 {


    static boolean contains(String src, String target){
        if(src.indexOf(target)==-1)
            return false;

           return true;
    }




    public static void main(String[] args) {
        System.out.println(contains("12345" ,"23"));
        System.out.println(contains("123456","d"));
    }
}
