public class ConstructorExample4{
       
       public static void main(String[] args){
              Point3D p3;
              p3 = new Point3D(1,2,3);
       }
       
}

class Point{
 
      int x;
      int y;
  
      Point(int x,int y){
            this.x = x;
            this.y = y;
      }
        
}

class Point3D extends Point{

      int z;
     
      Point3D(int x,int y,int z){
              super(x,y);
              this.z = z;
      }
       
}