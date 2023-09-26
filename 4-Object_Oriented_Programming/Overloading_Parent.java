class animals{
    public void m1(animals a){
        System.out.println("This is the parent animal class");
    }
}
class monkey extends animals{
    public void m1(monkey m){
        System.out.println("This is the Child class to parent animal");
    }
}
public class Overloading_Parent {
    public static void main(String[] args){
        monkey n = new monkey();
        n.m1(n);
        animals a = new animals();
        a.m1(a);
        monkey m = new monkey();
        m.m1(m);
        animals b = new monkey();
        b.m1(b);
    }
}
//if no parameter is passes it and there is overridden methods it depends on the objects
//when parameter is passed first it try to match perfect method with perfect parameters
//when paremeter is being passes it only depends on the referece types
//keep these point in mind