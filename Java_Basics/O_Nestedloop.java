import java.util.Scanner;
public class O_Nestedloop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n for diamond pattern : ");
        int n = scan.nextInt();
        for(int i=n ; i>=1 ; i--){
            for(int j=1 ;j<=n ;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        scan.close();
    }
}
