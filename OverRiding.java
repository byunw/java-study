class Point{
      int x;
      int y;
  
      String getLocation(){
        return "x :"+x+", y:"+y; 
      }
}

class Point3D extends Point{
      int z;
  
      //overriding 예제 
      String getLocation(){
        return "x :"+x+", y:"+y+", z:"+z; 
      }
}
