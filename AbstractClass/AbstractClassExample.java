abstract class Animal{
  
         public abstract void sleep();
         public abstract void eat();
          
}

class Dog extends Animal{
      
      public void sleep(){
             System.out.println("cool cool");
      }
  
      public void eat(){
             System.out.println("kaka");
      }
      
}

class Rabbit extends Animal{
      
      public void sleep(){
             System.out.println("zzz");
      }
    
      public void eat(){
             System.out.println("yum yum");
      }

}

class AbstractClassExample{
      
      public static void main(String[] args){
          Dog myDog = new Dog();
          myDog.sleep();
          myDog.eat();
      }
       
}
