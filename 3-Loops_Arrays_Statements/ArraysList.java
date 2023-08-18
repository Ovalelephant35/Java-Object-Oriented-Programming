import java.util.ArrayList;
import java.util.Scanner;
public class ArraysList {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("We will play evens only : ");
        System.out.println("Input 10 numbers and I will print even only : ");
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0 ;i<10 ; i++){
            int tt = scan.nextInt();
            scan.nextLine();
            if(tt%2==0){
                nums.add(tt);
            }
        }
        System.out.println("Even no: ");
        for(int i=0 ; i<nums.size() ; i++){
            System.out.println(nums.get(i));
        }
        scan.close();
    }
}
//other methods are : remove(index) , clear(Array clear) , set(Swapped with(index) , this element)