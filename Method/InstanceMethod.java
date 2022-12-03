class InstanceMethod{
     
      public static void main(String[] args){
             Cafe c1 = new Cafe();
             int cntPeopleNum = c1.personCome();
             System.out.println(cntPeopleNum);
      }
      
}

class Cafe{
       
      int floor;
      int numPeople;
      
       //인스턴스 메서드
      int personCome(){
          ++numPeople;
          return numPeople;
      }
  
}
