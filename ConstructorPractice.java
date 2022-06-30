class Car{
      
      //ivs 
      String color;
      String gearType;
      int door;
      
      //default constructor
      Car(){}
     
      //constructor with parameters
      Car(String c,String g,int d){
          color=c;
          gearType=g;
          door=d;
      }
}

public class ConstructorPractice{
       public static void main(String[] args){
              
              //creating an object(method1)
              Car c=new Car();
              c.color="white";
              c.gearType="auto";
              c.door=4;
              
              //creating an object(method2) simpler
              //Car c=new Car("white","auto",4);
              
              //printing out instance variable values of an object
              //white
              //auto
              //4
         
              System.out.println(c.color);
              System.out.println(c.gearType);
              System.out.println(c.door);
       }
}

         
              
