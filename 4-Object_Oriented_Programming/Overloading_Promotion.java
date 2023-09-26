class promotion{
    public void m1(int i){
        System.out.println("This is a int-arg Method");
    }
    public void m1(float i){
        System.out.println("This is a float-arg Method");
    }
}
//if no  promotion available or no method availabel then only compiler will give error otherwise it will run by trying and promoting to next datatypes
public class Overloading_Promotion {
    public static void main(String[] args){
        promotion p = new promotion();
        p.m1('a');
        p.m1(10L);
    }
}
