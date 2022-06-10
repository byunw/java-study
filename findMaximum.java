public class findMaximum{
       public static void main(String[] args){
           
          int array[];
          
          //어레이 생성 
          array=new int[3];
           
          //어레이에 데이터 삽입
          array[0]=1;
          array[1]=2;
          array[2]=3;
          
          //어레이에서 가장 큰 값 찾기
          int maximum=array[0];
          for(int i=0;i<3;++i){
              if(array[i]>=maximum){
                 maximum=array[i]; 
              }  
          }
          
          //가장 큰 값 출력 
          System.out.println(maximum);
             
  
       }
  
}
