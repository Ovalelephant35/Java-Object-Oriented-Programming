interface Computer{
    void code();
    void sleep();
}

class Desktop implements Computer{
    public void code(){
        System.out.println("He is Coding on Desktop");
    }
    public void sleep(){
        System.out.println("He is Sleeping");
    }
    
}

class Laptop implements Computer{
    public void code(){
        System.out.println("He is Coding on Laptop");
    }
    public void sleep(){
        System.out.println("He is Sleeping on his Laptop");
    }
    
}
public class Interfaceprac {
    public static void main(String[] args){
        Computer c1 = new Desktop();
        c1.code();
        Computer c2 = new Laptop();
        c2.sleep();
    }
}
