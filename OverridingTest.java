class MyPoint3{
      int x;
      int y;
      String getLocation(){
        return "x:"+x+",y"+y;
      }
}

class MyPoint3D extends MyPoint3{
    int z;
    //overriding example
    //this method is called instead
    String getLocation(){
      return "x:"+x+", y:"+y+", z:"+z; 
    }    
}

public class OverridingTest2{
   
   public static void main(String[] args){
       MyPoint3D p=new MyPoint3D();
       p.x=3;
       p.y=5;
       p.z=7;
       System.out.println(p.getLocation());  
   }
   
}

//출력결과 x:3, y:5, z:7

