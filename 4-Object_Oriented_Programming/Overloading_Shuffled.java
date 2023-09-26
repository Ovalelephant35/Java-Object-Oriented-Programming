class varible{
    public void m1(int i , float f){
        System.out.println("Int-Float");
    }
    public void m1(float i , int f){
        System.out.println("Int-Float");
    }
}
public class Overloading_Shuffled {
    public static void main(String[] args){
        varible v = new varible();
        v.m1(10 , 10.5f);
        v.m1(10.5f , 10);
        //v.m1(10,10); not allowed due to ambiguity 
        //even float float is also not allowed
    }
}
