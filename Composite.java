public class Composite {
    public static void main(String args[]){
        Circle c1=new Circle();
        //원 생성
        c1.p.x=3;
        c1.p.y=2;
        c1.r=3;   
    }
}

class Circle{
    //Circle 클래스랑 Point 클래스랑 포함관계
    Point p=new Point();
    int r;
}

class Point{
    int x;
    int y;
}


