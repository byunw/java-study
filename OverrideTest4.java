class MyPoint3{
      int x;
      int y;

      //constructor 
      MyPoint3(int x,int y){
        this.x=x;
        this.y=y;
      }
       
      public String toString(){
        return "x:"+x+", y:"+y;
      }
}

public class OverrideTest4{
  public static void main(String[] args){
         //creating object
         MyPoint3 p=new MyPoint3(3,5);
         
         //참조변수만 넘겨도 객체의 값들이 잘 찍힘
         System.out.println(p);
  }
}


//출력결과: x:3, y:5
