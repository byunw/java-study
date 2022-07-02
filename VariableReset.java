//지역변수 수동초기화 필요
//멤버변수 자동 초기화됨

class InitTest{
      
      //멤버변수
      int x;
      int y=x;
      
      void method1(){
        //지역변수
        int i=1;
        int y=i;
        System.out.println(y);
      }
       
}

public class VariableReset{
       public static void main(String[] args){
              InitTest it=new InitTest();
              System.out.println(it.x);
              System.out.println(it.y);
              it.method1();
       }
}
         
              
