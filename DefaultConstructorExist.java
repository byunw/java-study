class Data_1{
      int value;
}

class Data_2{
      int value;
      
      //default constructor
      Data_2(){}
      
      Data_2(int x){
        value=x;
      }
      
}

class DefaultConstructorExist{
      public static void main(String[] args){
             Data_1 d1=new Data_1();
             //calling default constructor in Data_2 class
             //successful compilation
             Data_2 d2=new Data_2();
      }
}
