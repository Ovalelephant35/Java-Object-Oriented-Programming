public class Array_of_objects {
    public static void main(String[] args){
        //Food[] ref = new Food[3];
        Food food1 = new Food("Paneer");
        Food food2 = new Food("chicken");
        Food food3 = new Food("Pizza");
        Food[] ref = {food1,food2,food3};
        // ref[0] = food1;
        // ref[1] = food2;
        // ref[2] = food3;
        System.out.println(ref[0].name);


    }
}
class Food{
    String name; 
    Food(String name){
        this.name = name;
    }
    
}
