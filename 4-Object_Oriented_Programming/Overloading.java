class overload{
    public void m1(){
        System.out.println("This is no arg method");
    }
    public void m1(int i){
        System.out.println("This is int arg method");
    }
    public void m1(float i){
        System.out.println("This is float arg method");
    }
    public void m1(String s){
        System.out.println("This is String arg method");
    }
}

public class Overloading {
    public static void main(String[] args){
        overload o = new overload();
        o.m1();
        o.m1(10);
        o.m1(10.5f);
        o.m1("n");
    }
}
