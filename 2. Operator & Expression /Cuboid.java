import java.util.*;
public class Cuboid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length , width , Height of Cuboid : ");
        int len = sc.nextInt();
        sc.nextLine();
        int wid = sc.nextInt();
        sc.nextLine();
        int hi = sc.nextInt();
        sc.nextLine();
        int vol = len*hi*wid;
        int are = 2*((len*wid)+(hi*wid)+(hi*len));
        System.out.println("Area : "+are);
        System.out.println("Volume : "+vol);
        sc.close();
    }
}
