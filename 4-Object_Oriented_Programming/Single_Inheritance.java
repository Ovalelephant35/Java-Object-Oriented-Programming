class Single{
    public void m5(){
        System.out.println("In this There is only one child and only one Parent");
    }
}

class Children extends Single{
    public void m6(){
        System.out.println("This method is present in child class with name m2");
    }
}

public class Single_Inheritance{
    public static void main(String[] args){
        Children c = new Children();
        c.m5();
    
    }
}