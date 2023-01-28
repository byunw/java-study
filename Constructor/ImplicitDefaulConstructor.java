public class SuperKeyWord{
      
       public static void main(String[] args){
              B b;
              b = new B();
       }
        
}

class A{
      int c = 10;
}

class B extends A{
      
      int c = 20;
      
      B(){
          System.out.println(super.c);
          System.out.println(this.c);
      }
       
}
