//there is nor concept of variable overriding in oops /java
class Variable{
    String s = "Anurag";
}
class Childvar extends Variable{
    String s = "Singh";
}
public class Overriding_Variable {
    public static void main(String[] args){
        Variable g1 = new Variable();
        System.out.println(g1.s);
        Childvar gg = new Childvar();
        System.out.println(gg.s);
        Variable gf = new Childvar();
        System.out.println(gf.s);//based on refernce types only 
    }
}
