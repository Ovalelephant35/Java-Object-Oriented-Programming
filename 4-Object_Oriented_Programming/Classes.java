//here we can decleare any number of class(not public) with name of file being anything without any compilation error
class A1{
    public static void main(String[] args){
        System.out.println("Class A");
    }
}
class B{
    //It cannot be executed as it does not contain main function
}
class C{
    //It cannot be executed either due to same reason 
}
//but we can have atmost one public class and it should be same name as the name of the file
public class Classes{
    public static void main(String[] args){
        System.out.println("classes");
    }
}
// we can have 3 other classes files being created and they can be executed seperately only if they have main function defined in them 