package Class_Level_Modifiers;

public class Classes {
    public static void main(String[] args){
        Publicclass p = new Publicclass();
        p.msg();
    }
}
//Public class can be used from anywhere

class A{
    public static void main(String[] args){
    System.out.println("This is Default Classes");
    }
}
//A class is not described ad public class thus it acts as a default class