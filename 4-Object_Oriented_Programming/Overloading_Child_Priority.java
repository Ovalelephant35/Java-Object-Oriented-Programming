class children{
    public void m1(Object O){
        System.out.println("This is object version");
    }
    public void m1(String s){
        System.out.println("This is String version");
    }
}
//string is child of object so if exact match is not found then child which is string version will implemented
public class Overloading_Child_Priority {
    public static void main(String[] args){
        children t = new children();
        t.m1(new Object());
        t.m1("Anurag");
        t.m1(null);
    }
}
