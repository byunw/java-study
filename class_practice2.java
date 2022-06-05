public class class_practice2{
       public static void main(String args[]){
              Cup cup1=new Cup();
              cup1.color="white";
              cup1.dollarPrice=8;
              cup1.gramWeight=200.1f;
              System.out.println(cup1.color);
              System.out.println(cup1.dollarPrice);
              System.out.println(cup1.gramWeight);
       }
}

class Cup{
      String color;
      int dollarPrice;
      float gramWeight;
}
