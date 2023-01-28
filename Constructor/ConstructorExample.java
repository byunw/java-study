public class ConstructorExample{
       
       public static void main(String[] args){
              Point point;
              point = new Point(1,2);
       }
      
}

class Point{
      
      int x;
      int y;
  
      Point(){
        this(0,0);
      }
       
      Point(int x,int y){
           this.x = x;
           this.y= y;
      }
        
}
