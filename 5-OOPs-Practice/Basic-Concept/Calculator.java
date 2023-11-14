class calc{//local variable are part of stack
    public int add(int a , int b){
        return a+b;
    }
    public int add(int a , int b , int c){
        return a+b+c;
    }
    public double add(double a , int b){
        return a+b;
    }
    public String add(String a , String b){
        return a+b;
    }
    public int sub(int a , int b){
        return a-b;
    }
    public int mul(int a , int b){
        return a*b;
    }
    public int div(int a , int b){
        return a/b;
    }

}

public class Calculator {
    public static void main(String[] args){
        calc c1 = new calc();//created inside heap memory 
        System.out.println(c1.add(5.6 , 2));//local variable are part of stack
    }
}
//there is a link between stack and heap with help of address
//jdk  ->java development kit contains all of this
//jVm  ->java virtual machine(where code is executed)
//jRe  ->java Runtime environment inside which is jvm