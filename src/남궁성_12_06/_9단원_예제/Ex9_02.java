package 남궁성_12_06._9단원_예제;

public class Ex9_02 {
    public static void main(String[] args) {
        Person p1= new Person(123456789L);
        Person p2= new Person(123456789L);
        if( p1==p2) //주소값이 다르니 다른사람이 뜨고
            System.out.println("같은사람 입니다.");
        else
            System.out.println("다른사람 입니다.");

        if (p1.equals(p2))//여기서 equals는 내가 오버라이딩해서 id값만 비교하는걸로 바꿨으니 같은사랍이 출력된다.
            System.out.println("같은사람 입니다.");
        else
            System.out.println("다른사람 입니다.");



    }



}


class Person{
    long id;
    public boolean equals (Object obj) { //조상의 메서드를 오버라이딩 해서 객체 주소값을 비교하는게 아닌 객체의 id long값을 비교하는
        //메서드로 바꿔주었다.
    if(obj instanceof Person)
        return id == ((Person) obj).id; //obj는 타입이 Object이기 때문에 Person 타입으로 형변환 시켜야한다.

        return false;
    }
    Person (long id){
        this.id= id;
    }


}