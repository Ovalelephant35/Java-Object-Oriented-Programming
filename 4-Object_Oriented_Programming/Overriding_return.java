class sigma{
    public Object m1(Object a){
        return a;
    }
}
class sigmoid extends sigma{
    public float m1(int a){
        return 1.5f;
    }
}// here no overiding is being done but they are seperate methods
public class Overriding_return {
    public static void main(String[] args){
        sigma s = new sigma();
        System.out.println(s.m1(5));
        sigmoid s1 = new sigmoid();
        System.out.println(s1.m1(5));
        sigma s2 = new sigmoid();
        System.out.println(s2.m1(20));
    }
}
//return type has to similar for method overriding or covariant of each other 