class animals{
    public void m1(monkey m){
        System.out.println("This is the parent animal class");
    }
}
class monkey extends animals{
    public void m1(){
        System.out.println("This is the Child class to parent animal");
    }
}
class apes extends monkey{
    public void m1(){
        System.out.println("This is the grandChild class to parent animal");
    }
}
public class Overriding_Parent {
    public static void main(String[] args){
        monkey n = new monkey();
        n.m1();
        animals a = new animals();
        a.m1(n);
        monkey m = new monkey();
        m.m1();
        animals b = new monkey();
        b.m1(n);
        animals z = new apes();
        z.m1(n);
    }
}
//We will make it very simple first we know that compiler is there then runtime acts 
//so first compiler will come and according to referce type it will check all the methods and parameters (method signature)
//then runtime (jBm) will come and see if there are any overridden methods with proper methods and parameters(method signature) it will give proirity to them accoriding to objects
//but overriding is not a easy process it is more than just method signature and everything has to match then only it will show the desired output