class sigma{
    public int m1(int a){
        return a;
    }
}
class sigmoid extends sigma{
    public int m1(int a){
        return 2*a;
    }
}
public class Overriding_return {
    public static void main(String[] args){
        sigma s = new sigma();
        System.out.println(s.m1(5));
        sigmoid s1 = new sigmoid();
        System.out.println(s1.m1(5));
        sigma s2 = new sigmoid();
        System.out.println(s2.m1(5));

    }
}
//return type has to similar for method overriding