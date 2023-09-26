class indepen{
    public void m1(String s){
        System.out.println("This is String version");
    }
    public void m1(StringBuffer sv){
        System.out.println("This is String Buffer Version");
    }
}
public class Overloading_Independent {
    public static void main(String[] args){
        indepen I = new indepen();
        I.m1("Anurag");
        I.m1(new StringBuffer("Anurag"));
        //I.m1(null);This will give error due to both method parameter being  independent there is ambiguity
    }
}
