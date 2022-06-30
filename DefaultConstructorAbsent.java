//Data_2 클래스에 기본 생성자 없어서 컴파일 에러 발생 

class Data_1{
      //컴파일러가 자동으로 기본 생성자 넣어줌 
      //Data_1(){
  
      //}     
      int value;
}

class Data_2{
      int value;
      //constructor with parameter
      Data_2(int x){
            value=x;
      }     
}
       
class DefaultConstructorAbsent{     
      public static void main(String[] args){
             Data_1 d1=new Data_1();
             Data_2 d2=new Data_2();
      }
}
