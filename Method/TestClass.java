class TestClass{

    int a;//iv
    int q;//iv 
     
    //인스턴스 메서드
    void a(){
        ++a;
    }
    
    static void b(){
        System.out.println(2);
    }
    
    //인스턴스 메서드에서 인스턴스 메서드 호출가능
    //인스턴스 메서드에서 클래스 메서드 호출가능
    void c(){
        a();
        b();
    }
        
    static void d(){
        // a(); 클래스 메서드에서 인스턴스 메서드 호출 불가능 
        b(); // 클래스 메서드에서 클래스 메서드 호출 가능   
    }
    
}


