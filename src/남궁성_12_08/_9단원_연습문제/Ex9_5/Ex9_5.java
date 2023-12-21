package 남궁성_12_08._9단원_연습문제.Ex9_5;

public class Ex9_5 {
    public static int count ( String src,String target) {
        int count = 0;
        int pos = 0;

        for (int i = 0; i < src.length(); i++) {
            if (src.indexOf(target,pos)!=-1) {
                count++;
                pos += target.length();
            }
            else if (src.indexOf(target) == -1) {
                return count;
            }
        }
            return count;





    }

    public static void main(String[] args) {
        System.out.println(count("12345AB123AB456AB","AB"));
        System.out.println();

    }

}
