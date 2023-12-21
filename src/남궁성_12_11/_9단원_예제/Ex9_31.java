package 남궁성_12_11._9단원_예제;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex9_31 {
    public static void main(String[] args) {
        String [] data ={"bat", "baby", "bonus", "cA", "ca","co","c.","c0","car","combat","count","date","disc"

        };

        Pattern p= Pattern.compile( "c[a-z]*]");

        for (int i = 0; i< data.length; i++){
        Matcher m = p.matcher(data[i]);





    }
}
    }