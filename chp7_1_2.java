public class chp7_1_2{
  public static void main(String[] args){
    
    //상속받은 클래스로 객체 생성 
    SmartHome home1=new SmartHome();
    
    //객체 필드값 지정 
    home1.automatic_ac=true;
    
    //객체 필드값 출력
    System.out.println(home1.window);
    System.out.println(home1.door);
    System.out.println(home1.automatic_ac);
    
  }
   
}

class Home{
  boolean window=true;
  boolean door=true;
}

class SmartHome extends Home{
   boolean automatic_ac;
}
