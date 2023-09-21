class Parent{
    public void m1(){
        System.out.println("This is Parent method m1");
    }
}

class Child extends Parent{
    public void m2(){
        System.out.println("This is a child class");
    }
}
public class Inheritance_1 {
    public static void main(String[] args){
        //case-1
        Parent p = new Parent();
        p.m1();
        //p.m2(); parent object cannot call child methods

        //case-2
        Child c = new Child();
        c.m1();//parent object can be called
        c.m2();

        //case-3
        Parent c1 = new Child();
        c1.m1();
        //c1.m2(); even parent holding child object cannot call child methods

        //case-4
        // Child p1 = new Parent(); child reference cannot hold parent objects
    }
}
