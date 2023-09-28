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
public class Overriding_Parent {
    public static void main(String[] args){
        animals a = new animals();
        monkey n = new monkey();
        n.m1();
        a.m1();
        monkey m = new monkey();
        m.m1();
        animals b = new monkey();
        b.m1();
    }
}
//if no parameter is passes it and there is overridden methods it depends on the objects
//when parameter is passed first it try to match perfect method with perfect parameters though if best parameters are found in parent class it will access but not vice versa and it is resolved using refernce data types only 
//keep these point in mind
//here we have encountered overloading as well as overriding