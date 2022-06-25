class Tv{
 //멤버
 boolean power;
 int channel;
 void power(){power=!power;}
 void channelUp(){++channel;}
 void channelDown(){--channel;}
}

class SmartTv extends Tv{
  boolean caption;
  void displayCaption(String text){
       if(caption){
          System.out.println(text);
       }
  } 
}

class Ex7_1{
      public static void main(String args[]){
        //객체 생성 
        SmartTv stv=new SmartTv();
        stv.channel=10;
        stv.channelUp();
        
        //11 출력
        System.out.println(stv.channel);
      }
}
