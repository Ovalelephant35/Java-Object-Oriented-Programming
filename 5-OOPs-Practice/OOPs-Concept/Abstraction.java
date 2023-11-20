abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Play Music");
    }
}

abstract class Maruti extends Car{
    public void drive(){
        System.out.println("Driving Maruti");
    }
}

class UpMaruti extends Maruti{
    public void fly(){
        System.out.println("Flying Maruti");
    }
}


public class Abstraction {
    public static void main(String[] args){
        Car c1 = new UpMaruti();
        c1.fly();
    }
}
