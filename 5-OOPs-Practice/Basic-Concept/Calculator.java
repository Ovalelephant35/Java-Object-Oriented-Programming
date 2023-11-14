class calc{
    int a=12;
    int b;
    calc(int a , int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
        return a+b;
    }
    public int sub(){
        return a-b;
    }
    public int mul(){
        return a*b;
    }
    public int div(){
        return a/b;
    }

}

public class Calculator {
    public static void main(String[] args){
        calc c1 = new calc(17,18);
        System.out.println(c1.a);
    }
}
//jdk  ->java development kit contains all of this
//jvm  ->java virtual machine(where code is executed)
//jRe  ->java Runtime environment inside which is jvm