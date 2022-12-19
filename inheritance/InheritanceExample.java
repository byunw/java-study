class Tv{
        
      boolean power;
      int channel;
       
      void power() {power = !power;}
      void channelUp() {++channel;}
      void channelDown() {--channel;}
  
}

class SmartTv extends Tv{
       
      boolean caption;
    
      void displayCaption(String text){
           if(caption){
              System.out.println(text);
           }
      }
       
}

public class InheritanceExample {
      
       public static void main(String[] args){
 
              SmartTv st = new SmartTv();
              st.channel = 10;
              st.channelUp();
              System.out.println(st.channel);
              st.displayCaption("hello, World");
              st.caption = true;
              st.displayCaption("Hello, World");
        
       }
}
         
               
