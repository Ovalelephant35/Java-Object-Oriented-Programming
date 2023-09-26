class tests{
    public void m1(int t){
        System.out.println("You have chosen this number : "+t);
    }
    public void m2(String a){
        System.out.println("Your name is "+a);
    }
}
public class Method_Signature {
    public static void main(String[] args){
        tests t = new tests();
        t.m1(10);
        t.m2("Anurag");
    }
}
