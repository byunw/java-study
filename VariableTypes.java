public class VariableTypes{
  
    public static void main(String[] args){
         
         //객체 생성 
         Book book1=new Book();
         book1.pageNumber=300;
         Book book2=new Book();
         book2.pageNumber=500;
         
         //클래스변수 접근하는 나쁜방법 
         System.out.println(book1.Cover);
         System.out.println(book2.Cover);   
          
         //클래스변수 접근하는 좋은방법 
         System.out.println(Book.Cover);
          
    }
    
    
  }
  
  class Book{
    
    //인스턴스 변수
    int pageNumber;
    
    //클래스 변수
    //클래스 변수는 실행 처음부분에 한번 메모리에 생성됨 
    static Boolean Cover=true;
    
    
  }
