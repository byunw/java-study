class MyPoint{
  int x;
  int y;
}

class Circle extends MyPoint{//상속
 int r;  
}  

public class InheritanceTest{
  public static void main(String[] args){
    //객체 생성
    Circle c=new Circle();
    c.x=1;
    c.y=2;
    c.r=3;
    
    //객체 값 출력 
    System.out.println(c.x);
    System.out.println(c.y);
    System.out.println(c.r);
  }
}
