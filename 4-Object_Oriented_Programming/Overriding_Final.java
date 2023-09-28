class fin{
    public final void m1(){
        System.out.println("This is a final method and it cannot be overriden ");
    }
    //private void m2(){
      //  System.out.println("This is a private method");
    //}
}
class subfin extends fin{
    // public void m1(){

    // }this given compilatin error
    // private void m2(){
    //     System.out.println("This is private method of children class");
    // }
}
public class Overriding_Final{
    public static void main(String[] args){
        fin f = new fin();
        //f.m2();cannot be accessed
        f.m1();

    }
}
