public class Object_Passing {
    public static void main(String [] args){
        Garage garage = new Garage();
        Car car = new Car("BMW");
        garage.park(car);
    }
}

class Car{
    String name;
    Car(String name){
        this.name = name;
    }
}
class Garage{
    void park(Car car){
        System.out.println("The "+car.name+" is Parked");
    }
}
