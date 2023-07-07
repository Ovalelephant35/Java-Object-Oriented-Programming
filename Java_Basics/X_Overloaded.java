public class X_Overloaded {
    static void add(int a1 , int a2){
        System.out.println("Method 1 is used : ");
        System.out.println("Answer is : "+(a1+a2));
    }
    static void add(int a1 , int a2 , int a3){
        System.out.println("Method 2 is used : ");
        System.out.println("Answer is : "+(a1+a2+a3));
    }
    static void add(int a1 , int a2, int a3 , int a4){
        System.out.println("Method 3 is used : ");
        System.out.println("Answer is : "+(a1+a2+a3+a4));
    }
    public static void main(String[] args){
        int a1 = 5;
        int a2 = 10;
        int a3 = 15;
        int a4 = 20;
        add(a1 , a2);
        add(a1 , a2, a3);
        add(a1 , a2 , a3 , a4);
    } 
}
