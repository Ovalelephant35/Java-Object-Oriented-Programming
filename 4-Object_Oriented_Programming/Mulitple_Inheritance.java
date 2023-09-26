//This inheritance is not supported in java due Diamond access problem or in simpler terms call ambiguity problem 
//Though inheritance can be used using interface method because in that case implemention in takes cared differently
interface p1{
    public void m1();
}
interface p2{
    public void m2();
}
interface a1 extends p1,p2{

}
//there wont be any problem in compilation though further we need to implement this using class and then use that class to further use it in our code
public class Mulitple_Inheritance {
    public static void main(String[] args){
        System.out.println("This is an example of Multiple inheritance");
    }
}
