class alpha{

}
class beta extends alpha{

}
class testing{
    public void m1(alpha a){
        System.out.println("This is Alpha version");
    }
    public void m1(beta a){
        System.out.println("This is Beta version");
    }
}
public class Overloading_Reference {
    public static void main(String[] args){
    testing t = new testing();
    alpha a = new alpha();
    beta b = new beta();
    alpha a1 = new beta();
    t.m1(a);
    t.m1(b);
    t.m1(a1);
    }

}
