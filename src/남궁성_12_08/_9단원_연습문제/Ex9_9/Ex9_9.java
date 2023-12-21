package 남궁성_12_08._9단원_연습문제.Ex9_9;

public class Ex9_9 {


    static String delChar(String src, String delCh){
        for (int i= 0; i<delCh.length(); i++){
          src = src.replace(delCh.charAt(i)+"","");
        }
        return src;
    }


    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)"+" -> "
                + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)"+" -> "
                + delChar("(1 2 3 4\t5)"," \t"));


    }
}
