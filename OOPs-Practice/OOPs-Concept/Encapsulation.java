class Human{
    private String name;//data cannot be accessed directly you have to use method and in method data is encapsulated
    private int age;
    private boolean alive;
    
    public Human() {
    }

    public Human(int age) {
        this.age = age;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //this keyword helps to diff between local variable and instance variable allowing to not send obj as argument but use them directly implicitly 
    public Human(String name, int age, boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name , Human obj) {
        obj.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}


public class Encapsulation {
    public static void main(String [] args){
    Human h1 = new Human();
    h1.setName("Anurag" , h1);
    System.out.println(h1.getName());
    }
}