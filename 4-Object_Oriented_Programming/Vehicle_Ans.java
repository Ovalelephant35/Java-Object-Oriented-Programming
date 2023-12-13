class foo {

    // public void setbar(Bar bar1){
    //     this.bar = bar1;
    // }
    // void set(){
    //     bar = new Bar();
    // }
}

class Bar{
    private static int srno=5 ;
    private int mySr=0;
    public Bar(){
        mySr = srno++;
    }
    static void m1(){System.out.println(srno);}
    void m2(){System.out.println(mySr);}

}

public class Vehicle_Ans{
    public static void main(String[] args){
    Bar bar1 = new Bar() ;
    Bar.m1();
    bar1.m2();
    // foo f1 = new foo();
    // f1.setbar(new Bar());
    // Bar.m1();
    // bar1.m2();
}
}

