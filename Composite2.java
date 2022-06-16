public class Composite2{
    public static void main(String args[]){
        
       //얼굴있고,두팔있고,몸통있고,다리 있는 사람 메모리에 나타냄 
       Human hm1=new Human();
       hm1.Face=true;
       hm1.ub.TwoArms=true;
       hm1.ub.Torso=true;
       hm1.lb.TwoLegs=true;
      
    }
}


class Human{
  boolean Face;
  UpperBody ub=new UpperBody();
  LowerBody lb=new LowerBody();
}

class UpperBody{
 boolean TwoArms;
 boolean Torso;
}

class LowerBody{
  boolean TwoLegs; 
}
