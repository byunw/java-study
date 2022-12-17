class VariableInitialization{
      
      //클래스 변수: heap Permanent Generation 지역에 생성됨 
      static int data;
  
      //인스턴스 변수들은 자동 초기화됨
      int x;
      int y = x;
       
      void method1(){
           int i = 7;
           int j = i;
      }
       
}
