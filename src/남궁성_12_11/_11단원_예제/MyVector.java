package 남궁성_12_11._11단원_예제;

import java.util.List;




abstract public class MyVector implements List{
    Object [] data = null; //객체를 담기 위한 배열
    int capacity =0;
    int size =0;

    public MyVector (int capacity) throws IllegalAccessException { //생성자 생성        //용량은 배열의 길이 크기는 배열의 저장된 객체의 수
        if ( capacity<0 ) //유효성 검사{
            throw  new IllegalAccessException("유효하지 않은 값입니다. :"+ capacity);

        this.capacity =capacity;
        data = new Object[capacity];

    }



    public MyVector () throws IllegalAccessException {
        this (10);
    }


    //최소한의 저장공간을 확보하는 메서드
public void ensureCapacity ( int minCapacity) {
        if ( minCapacity - data.length>0)
            setCapacity (minCapacity);
}
public boolean add ( Object obj){
        //새로운 객체를 생성하기전에 저장할 공간을 확보한다.
        ensureCapacity(size+1);
        data[size++]= obj;
        return true;
}
public Object get ( int index){
        if ( index <0 || index >= size)
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        return data [index];
}
public Object remove (int index) {
        Object oldObj = null;

        if (index <0 || index >=size )
            throw new IndexOutOfBoundsException( "범위를 벗어났습니다.");
        oldObj= data[index];

        if ( index != size -1){
            System.arraycopy(data, index+1, data, index, size-index-1);
        }
        data[size-1] =null;
        size --;
        return oldObj;


}

public boolean remove (Object obj){
        for (int i=0; i<size; i++){
            if (obj.equals(data[i])){ //data배열안에 있는 객체들이랑 비교했을때 같으면 삭제를 하고 true를 반환
                remove(i);
                return true;
            }
        }
        return false; //다르면 false
    }

public void trimTosize(){
        setCapacity(size);
}

private void setCapacity( int capacity){
        if (this.capacity == capacity) return;

        Object [] tmp = new Object[capacity];
        System.arraycopy(data,0,tmp,0,size); //data  배열 인덱스 0에서 tmp 배열 0으로  size 갯수만큼 배열을 복사
        data= tmp; //data 참조변수는 tmp를 가르킨다.
        this.capacity= capacity;
}

public void clear(){ //모든 값을 null로 초기화
        for (int i=0; i<size; i++)
            data[i]= null;
        size =0;
}

public Object[] toArray(){ //data를 배열로
        Object[] result = new Object[size];
        System.arraycopy(data,0,result,0,size);
        return result;

}

public boolean isEmpty(){return size ==0;}
public int capacity(){return capacity;}
public int size(){return size;}


}