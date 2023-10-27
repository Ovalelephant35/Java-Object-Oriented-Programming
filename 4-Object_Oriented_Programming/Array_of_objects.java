public class Array_of_objects {
    public static void main(String[] args){
        //Food[] ref = new Food[3];
        Food[] ref = new Food[3];
        ref[0] = new Food();
        ref[0].name = "anurag";
        
        System.out.println(ref[0].name);


    }
}
class Food{
    String name; 
    // Food(String name){
    //     this.name = name;
    // }
    
}
