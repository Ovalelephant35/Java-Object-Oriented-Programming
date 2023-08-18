public class Swap {
    public static void main(String[] arsg){
        int a = 5;
        int b = 10;
        System.out.println("Nos before Swap are : "+ a +", " +b);
        int tmp = a;
        a = b ; 
        b = tmp;
        System.out.println("Nos after Swap are :"+ a +" , "+b);
    }
    
}
