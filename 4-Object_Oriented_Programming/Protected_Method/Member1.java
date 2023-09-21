package Protected_Method;
public class Member1 {
    protected void m1(){
        System.out.println("This is a protected method available to child and within same packages");
    }

}
class A{
    public static void main(String[] args){
        Member1 a = new Member1();
        a.m1();
        

    }
}
class B extends Member1{
    public static void main(String[] args){
        B b = new B();
        b.m1();
        Member1 a = new Member1();
        a.m1();
        Member1 c = new B();
        c.m1();
    }
}
