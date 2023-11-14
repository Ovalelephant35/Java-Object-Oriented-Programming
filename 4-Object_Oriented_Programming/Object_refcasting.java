class ast{
    public  void m1(){
        System.out.println("This is class A");
    }
}
class bst extends ast{
    public  void m1(){
        System.out.println("This is class B");
    }
}
class cst extends bst{
    public  void m1(){
        System.out.println("This is class C");
    }
}
public class Object_refcasting {
        public static void main(String[] args){
        cst c = new cst();
        c.m1();
        ((bst) c).m1();//based on refernce type as it refernce type when static keyword is used
        ((ast)((bst) c)).m1();//based on refernce type as it is refernce type
    }
}
