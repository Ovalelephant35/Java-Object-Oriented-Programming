public class BitwiseOperation {
    public static void main(String[] args){
        int x = 0b1010;
        int y = 0b0110;
        int z = x&y;
        System.out.println("And Operation :"+z);
        z = x|y;
        System.out.println("Or Opeartion :"+z);
        z = x^y;
        System.out.println("XOR Operation :"+z);
    }
}
