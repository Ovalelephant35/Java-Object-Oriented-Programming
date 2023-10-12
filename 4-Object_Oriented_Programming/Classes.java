// //here we can decleare any number of class(not public) with name of file being anything without any compilation error
// class A1{
//     public static void main(String[] args){
//         System.out.println("Class A");
//     }
// }
class B{
    private int a=12;
    public int getA(){
        return a;
    }
}
class C{
    B b;
    C(B b){
        this.b=b;
    }
    public int A(){
        return b.getA();
    }
}
//but we can have atmost one public class and it should be same name as the name of the file
public class Classes{
    public static void main(String[] args){
        B al = new B();
        C obj = new C(al);
        System.out.println(obj.A());

    }
}
// we can have 3 other classes files being created and they can be executed seperately only if they have main function defined in them 