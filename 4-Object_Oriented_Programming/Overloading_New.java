class newer{
    public void m1(int i){
        System.out.println("This is the older version");
    }
    public void m1(int... i){
        System.out.println("This is available in the newer version");
    }
}
public class Overloading_New {
    public static void main(String[] args){
        newer n = new newer();
        n.m1();
        n.m1(10);
        n.m1(10,20);//new version only gets priority when older version is not applicable as we can see in earlier cases
    }
}
