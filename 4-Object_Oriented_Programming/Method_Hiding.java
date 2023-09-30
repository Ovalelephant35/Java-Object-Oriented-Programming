class hiding{
    public static void m1(){
        System.out.println("This is parent static method");
    }
}
class childh extends hiding{
    public static void m1(){
        System.out.println("This is child static method"); 
    }
}
public class Method_Hiding {
    public static void main(String[] args){
        //hiding h1 = new hiding();
        hiding.m1();
        //childh c1 = new childh();
        childh.m1();
        //hiding c2 = new childh();
        hiding.m1();//based on reference type only
    }
}
