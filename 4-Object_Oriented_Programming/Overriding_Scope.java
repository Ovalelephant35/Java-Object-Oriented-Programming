class scoping{
    public void m1(){
        System.out.println("This is a highest scoped method");
    }
    protected void m2(){
        System.out.println("This is a protected method scoping can be incresed");
    }
}
class subscop extends scoping{
    // protected void m1(){

    // }not possible
    public void m2(){
        System.out.println("This is a increasd scoped");
    }
}
public class Overriding_Scope {
    public static void main(String[] args){
        scoping sc = new scoping();
        sc.m1();
        sc.m2();
        scoping sd = new subscop();
        sd.m2();
    }   
}
