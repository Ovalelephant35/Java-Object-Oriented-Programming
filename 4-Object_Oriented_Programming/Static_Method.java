class mymeth{
    public static void m1(){
        System.out.println("This is a static method");
    }
    public void m2(){
        System.out.println("This is a non-static methos");
    }
}
public class Static_Method {
    public static void main(String[] args){
    mymeth.m1();//without creating instance of the objects
    //mymeth.m2()cannot be called without creating an objects
    mymeth a = new mymeth();
    a.m2();
    }
}
