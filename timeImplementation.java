public class timeImplementation{
   public static void main(String args[]){
      
     //비객체지향방식 코드
     //int hour;
     //int minute;
     //int second;
     
     //객체지향방식 코
     time t1=new time();
     t1.hour=21;
     t1.minute=23;
     t1.second=26;
     
   }  
}

class time{
  int hour;
  int minute;
  int second; 
}
