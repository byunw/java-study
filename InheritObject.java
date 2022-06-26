
//Object 클래스는 모든 클래스의 조상
//컴파일러가 상속안하는 클래스한테 extends Object 자동추가
//human 클래스는 toString() 상속받음 
class human{
  //public String toString(){
    //..
  //}
}

public class InheritObject{
 public static void main(String[] args){
   //객체 생성
   human I=new human();
   //human 클래스가 Object 클래스 상속받아서 다음과 같이 사용가능
   System.out.println(I.toString());
 }
}

