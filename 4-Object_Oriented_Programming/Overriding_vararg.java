class Vararg{
    public void m1(int...i){
        System.out.println("This is parent");
    }
}
class Childvar extends Vararg{
    public void m1(int i){
        System.out.println("This is child");
    }
}//this is not overriding but overloading
public class Overriding_vararg {
    public static void main(String[] args){
        Vararg v1 = new Childvar();
        v1.m1();//based on refernce type
    }
}
