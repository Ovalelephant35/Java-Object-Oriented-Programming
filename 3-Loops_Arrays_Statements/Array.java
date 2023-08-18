import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter the 4numbers of your choice :");
        for(int i=0 ; i<4 ; i++){
            arr[i]=scan.nextInt();
            scan.nextLine();
        }
        Arrays.sort(arr);
        System.out.println("Numbers Entered by you in Decending Order :");
        for(int i=3 ; i>=0 ; i--){
            System.out.println(arr[i]);
        }
        scan.close();
    }
    
}
