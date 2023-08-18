import java.util.Scanner;
public class MethodsString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two strings : ");
        String a = scan.nextLine();
        String b = scan.nextLine();
        boolean bool = a.equals(b);
        int lena = a.length();
        int lenb = b.length();
        char c = a.charAt(0);
        int ind = b.indexOf(c);
        String caps =a.toUpperCase();
        String nex = b.replace('o', 'u');
        System.out.println("Are the strings equal : "+bool);
        System.out.println("Length of a : "+lena);
        System.out.println("lenght of b : "+lenb);
        System.out.println("First char of a : "+c);
        System.out.println("Index of first char of a in b if there : "+ind);
        System.out.println("String 1 in caps: "+caps);
        System.out.println("All o replaced by u in b: "+nex);
       scan.close();


    }
}
