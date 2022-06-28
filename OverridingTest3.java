class Mypoint3{
   
   int x;
   int y;   
   
   //overriding example
   public String toString(){
     return "x:"+x+", y:"+y;
   }
   
}

public class OverridingTest3{
  public static void main(String[] args){
    Mypoint3 p=new Mypoint3();
    p.x=3;
    p.y=5;
    System.out.println(p.toString());    
  } 
}
