class Car{
      
      //instance variables 
      String color;
      String gearType;
      int door;
      
      //default constructor
      Car(){
         //calling nondefault constructor
         //because of this keyword, the codes in Car() can be reduced   
         this("white","auto",4);
      }
      
      //nondefault constructor
      Car(String c,String g,int d){
         color=c;
         gearType=g;
         door=d;
      }  
}

public class KeywordThisPractice{
       public static void main(String[] args){
               Car c=new Car();
               System.out.println(c.color);
               System.out.println(c.gearType);
               System.out.println(c.door);
       }
}
