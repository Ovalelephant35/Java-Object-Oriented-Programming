class Single{
    public void m1(){
        System.out.println("In this There is only one child and only one Parent");
    }
}

class child extends Single{
    public void m2(){
        System.out.println("This method is present in child class with name m2");
    }
}

public class Single_Inheritance{
    public static void main(String[] args){
        child c = new child();
        c.m1();
        c.m2();
    }
}