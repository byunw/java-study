public class StringDive{
       
       public static void main(String[] args){
              
              //java string literal                
              String s1 = "abc";
              String s2 = "abc";
              String s3 = "abd";
              
              if(s1==s2){
                 System.out.println("s1과 s2는 같은 객체를 가리킨다");
              }
         
              if(s1!=s3){
                 System.out.println("참조변수 s1과 s3는 다른 객체를 가리킨다");
              }
         
       }
        
}
               
