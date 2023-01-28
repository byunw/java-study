
public class ConstructorExample2{
       
       public static void main(String[] args){
              Point p;
              p = new Point(1,2,4);
              System.out.println(p.x);
              System.out.println(p.y);
              System.out.println(p.z);
       }
                
}

class PointAncestor{
      
      int x;
      int y;
  
      PointAncestor(int x,int y){
                   super();
                   this.x = x;
                   this.y = y;
      }  
                     
}

class Point extends PointAncestor{
      
      int z;
      
      Point(int x,int y,int z){
           super(x,y);
           this.z = z;
      }
       
}
