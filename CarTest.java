class Car{
  
    //인스턴스 변수
    String color;
    String gearType;
    int door;
      
    //생성자
    Car(){}
    
    //생성자
    Car(String c,String g,int d){
        color=c;
        gearType=g;
        door=d;
    }
      
}

public class CarTest{
  
    public static void main(String[] args){
        
        //객체 생성
        Car c1=new Car();
        c1.color="white";
        c1.gearType="auto";
        c1.door=4;
        
        //객체 생성 
        Car c2=new Car("white","auto",4);
        
        System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
        System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
         
      
    }   
 
  
}
