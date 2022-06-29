class company{
      String name;
      boolean teamwork;
      int teamnumber;
}

public class ObjectTest{
       
       public static void main(String[] args){
              company c1=new company();
              //company 클래스가 Object 클래스 상속받아서 가능
              c1.toString();
       }
}
