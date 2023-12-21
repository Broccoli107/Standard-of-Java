package 남궁성_11_29._6단원_연습문제;

public class Ex6_22 {
    static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!('0' <= s.charAt(i) && s.charAt(i) <= '9')) {
                return false;
            }
                ;
            }
       return true;

        }




    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));
    }
}
