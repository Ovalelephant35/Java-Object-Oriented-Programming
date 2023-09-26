//one class had one child then that child class has one grancdchild class though its not necessary to have only one child class its the most used and accessible inheritance type in java
class A2{
    public void m1(){
        System.out.println("This is parent class");
    }
}

class B2 extends A2{
    public void m2(){
        System.out.println("This is child class");
    }
    // public void m1(){
    //     System.out.println("This is overriding parent class using child class");
    // }
}

class C2 extends B2{
    public void m3(){
        System.out.println("This is grandchild class");
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args){
        A2 a  = new A2();
        a.m1();
        B2 b  = new B2();
        b.m1();
        b.m2();
        C2 c  = new C2();
        c.m1();
        c.m2();
        c.m3();
    }
}
