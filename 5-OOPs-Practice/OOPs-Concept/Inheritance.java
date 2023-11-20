class Calculator{
    public int add(int a , int b){
        return a+b;
    }
    public int sub(int a , int b){
        return a-b;
    }
}

class AdvCalc extends Calculator{
    public int  mul(int a , int b){
        return a*b;
    }
    public int div(int a , int b){
        return a/b;
    }
}

class SciCala extends AdvCalc{
    public int mul(int a , int b){
        return a*b*5;
    }

    @Override
    public String toString() {
        return "SciCala []";
    }
    
}



public class Inheritance {
    public static void main(String[] args){
        SciCala sc = new SciCala();
        System.out.println(sc.mul(5,6));
        sc.toString();
    }


}
