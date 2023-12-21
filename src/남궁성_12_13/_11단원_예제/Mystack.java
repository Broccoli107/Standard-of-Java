package 남궁성_12_13._11단원_예제;

import java.util.EmptyStackException;
import java.util.Vector;

public class Mystack extends Vector {
    public  Object push (Object item) {
        addElement(item);
        return item;
    }

    public Object pop() {
        Object obj = peek();
        removeElementAt(size()-1);
        return obj;
    }
    public Object peek() {
        int len = size();
        if (len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);   //get()메서드랑 똑같다.


    }
     public boolean empty() {
         return size() == 0;
     }

      public  int search (Object o) {
        int i = lastIndexOf(o);

        if( i>=0){
            return size() -i; //stack은 맨 위에 저장된 객체의 index 를 1로 정의한다.
        }


        return -1;
    }
}
