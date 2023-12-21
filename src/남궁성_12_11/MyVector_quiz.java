package 남궁성_12_11;

public class MyVector_quiz {
    public static void main(String[] args) {

        MyVector mv= new MyVector();
        System.out.println(mv.capacity());
        mv.add(1);
        mv.add(1);
        mv.add(1);


        System.out.println(mv);

        System.out.println(mv);




    }
}
class MyVector {
    Object[] objArr;
    int size;

    MyVector(int capacity) {
        objArr = new Object[capacity];
    }

    MyVector() {
        this(16);
    }

    int size() {
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] != null)
                ++size;


        }
        return size;
    }

    int capacity() {
        return objArr.length;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < objArr.length; i++) {

            if (objArr[i] != null)
                s += objArr[i];
        }
        return s;
    }

    void add(Object obj) {

        //사이즈가 배열의 길이를 넘어서면
        if(size()>= objArr.length){
            //배일 길이를 늘린 새로운 배열에 기존 배열의 데이터를 복사한다.
            Object []tmp= new Object[objArr.length*2];
            System.arraycopy(objArr,0, tmp, 0, objArr.length);//objArr 인덱스 0에서 tmp 0으로 size()만큼 복사
            objArr= tmp;

        }
        objArr[size] = obj;
        size++;

    }





    int indexOf(Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i].equals(obj)) {
                return i;

            }


        }
        return -1;
    }

    boolean remove(Object obj) {
        if (indexOf(obj) != -1) {
            if (indexOf(obj) != size - 1)
                System.arraycopy(objArr, indexOf(obj) + 1, objArr, indexOf(obj), size - indexOf(obj) - 1);
            else
                objArr[indexOf(obj)] = null;

            size--;
            return true;
        } else
            return false;
    }
}


