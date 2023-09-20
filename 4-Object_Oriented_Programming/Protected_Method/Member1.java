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
