public abstract class AbsM_AbsC {
    public abstract void m1();
    public abstract void m2();
}
abstract class test extends AbsM_AbsC{
     public void m1(){

    }
}
class subtest extends AbsM_AbsC{
    public void m2(){

    }
    public void m1(){

    }
}
//here this test class is the child class and it should contain ans define all the abstract method of the parent class 
//if you dont want it to contain it all the method then decleare it also abstract
//you can make any number of child class grandchild classes