class Mother{
      //overriden method
      public void smile(){
             System.out.println("The mother smiling");
      }
}

class Baby extends Mother{
      
      //overriding method 
      public void smile(){
             System.out.println("The baby is smiling");
      }
     
      public void tickle(){
             System.out.println("The baby is tickling"); 
      }
      
}

public class OverridingTest4{
       public static void main(String[] args){
              Mother call=new Mother();
              Mother call1=new Baby();
              
              //calling overriding method 
              call1.smile();
              //calling smile() in mother class
              call.smile();
              
       }
}

//execution output is the following
//The baby is smiling
//The mother smiling
