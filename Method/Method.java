class Method {
    
    int a;//iv
    static int b;//cv

    //인스턴스 메서드
    void instanceMethod(){
        System.out.println(a);//인스턴스 메서드에서 iv 사용 가능
        System.out.println(b);//인스턴스 메서드에서  cv 사용 가능
    }

    //클래스 메서드
    static void staticMethod(){
        //System.out.println(a);//클래스 메서드에서 iv 사용 불가능 
        System.out.println(b);//클래스 메서드에서 cv 사용 가능
    }

}

class Run{

    public static void main(String[] args){

        //인스턴스 메서드 사용
        Method m = new Method();
        m.instanceMethod();
        
        //클래스 메서드 사용
        Method.staticMethod();

    }

}
