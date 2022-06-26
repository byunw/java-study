class MyPoint{
    int x;
    int y;
}

class Circle{//포함 관계 
    MyPoint p=new MyPoint();
    int r;
}

public class InheritanceTest2{
    public static void main(String[] args){
        
        //객체 생성 
        Circle c=new Circle();
        c.p.x=1;
        c.p.y=2;
        c.r=3;

        //데이터 출력
        //1
        //3
        //2
        System.out.println(c.p.x);
        System.out.println(c.r);
        System.out.println(c.p.y);  


    }
}
