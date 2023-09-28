class abs{
    public void m1(){
        System.out.println("This is a normal method");
    }
}
abstract class aps extends abs{
    abstract public void m1();
}

class ads extends aps{
    public void m1(){
        System.out.println("This is implemented abstract method");
    }
}
public class Overriding_abstract {
    public static void main(String[] args){
        abs ab = new abs();
        ab.m1();
        ads ad = new ads();
        ad.m1();
        abs ap = new ads();
        ap.m1();
    }
}
