public class OOPS {
    public static void main(String[] args){
        Car car = new Car();
        System.out.println(car.name);
        car.running();
        car.breaking();    
    }
}

class Car{
    String name = "Toyota" ;

    void running(){
        System.out.println("Your car is Speeding");
    }
    void breaking(){
        System.out.println("Your car is Stopping");
    }
    }
