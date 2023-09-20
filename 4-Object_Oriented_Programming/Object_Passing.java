public class Object_Passing {
    public static void main(String [] args){
        Garage garage = new Garage();
        Carsr car = new Carsr("BMW");
        garage.park(car);
    }
}

class Carsr{
    String name;
    Carsr(String name){
        this.name = name;
    }
}
class Garage{
    void park(Carsr car){
        System.out.println("The "+car.name+" is Parked");
    }
}
