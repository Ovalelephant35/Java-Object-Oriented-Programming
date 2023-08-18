import java.util.Scanner;
public class Nestedloop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n for diamond pattern : ");
        int n = scan.nextInt();
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ;j<=n-i ;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=n-1 ; i>=1 ; i--){
            for(int j=1 ;j<=n-i ;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                if(k==1||k==(2*i)-1){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
