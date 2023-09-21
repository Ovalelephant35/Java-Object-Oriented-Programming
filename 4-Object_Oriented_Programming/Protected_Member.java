import Protected_Method.Member1;


public class Protected_Member extends Member1 {
    public static void main(String[] args){
    Protected_Member p = new Protected_Member();
    p.m1();
    }
}
//child can access protected members of the family without even need of the import statements but only child reference can be used 