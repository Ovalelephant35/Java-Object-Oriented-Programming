class animals{
    public void m1(){
        System.out.println("This is the parent animal class");
    }
}
class monkey extends animals{
    public void m1(){
        System.out.println("This is the Child class to parent animal");
    }
}
public class Overloading_Parent {
    public static void main(String[] args){
        monkey n = new monkey();
        n.m1();
        animals a = new animals();
        a.m1();
        monkey m = new monkey();
        m.m1();
        animals b = new monkey();
        b.m1();
    }
}
//if no parameter is passes it and there is overridden methods it depends on the objects
//when parameter is passed first it try to match perfect method with perfect parameters
//when paremeter is being passes it only depends on the referece types
//keep these point in mind