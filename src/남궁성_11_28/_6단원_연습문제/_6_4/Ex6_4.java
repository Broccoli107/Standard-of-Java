package 남궁성_11_28._6단원_연습문제._6_4;

public class Ex6_4 {
    public static void main(String[] args) {


    Student s = new Student("홍길동", 1,1,100, 60, 76);

//        System.out.println(s.info());


//        System.out.println( "이름: " +s.name);
//        System.out.println("총점: "+s.getTotal());
        System.out.println("평균 :"+ s.getAverage());
//


    }
}
class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    //생성자 추가
    Student (String name, int ban, int no, int kor, int eng, int math) {
        this.name=name;
        this.ban= ban;
        this.no = no;
        this. kor =kor;
        this.eng =eng;
        this.math= math;

    }





//총점을 반환 하는 메서드  getTotal 작성
    int getTotal (){
       return kor+eng+math;
    }
//평균을 반환 하는 메서드 getAverage 작성
    float getAverage () {
        return Math.round ((float) (kor + eng + math) / 3 * 10)/10f; //Math.round는 소수점 첫째 자리에서 반올림해서 long으로 반환
    }
    String info  () {
         return this.name+","+this.ban+","+this.no+","+this.kor+","+this.eng+","+this.math+","+getTotal()+","+getAverage();
        }


}