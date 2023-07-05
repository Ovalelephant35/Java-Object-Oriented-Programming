import java.util.Scanner;
public class N_Forloop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter till from where to where you want to print numbers : ");
        int n = scan.nextInt();
        scan.nextLine();
        int m = scan.nextInt();
        scan.nextLine();
        for(int i=n ; i<=m ; i++ ){
            System.out.println(i);
        }
        scan.close();
    }
}
