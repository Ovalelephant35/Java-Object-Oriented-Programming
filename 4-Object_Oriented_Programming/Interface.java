interface interf{
    void m1();
    public void m2();//all methods should be abstract and public whether you decleare or not
}

abstract class Interfac implements interf {
    public void m1(){
        System.out.println("This is method 1 in parent service provider");
    }
}   //with abstract class no objects can be created 

class subInterface extends Interfac{
    public void m2(){
        System.out.println("This is method 2 in child class");
    }
}

public class Interface{
    public static void main(String[] args){
    subInterface I = new subInterface();
    I.m1();
    I.m2();
    }

}

