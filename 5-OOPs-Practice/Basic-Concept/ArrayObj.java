class Student{
    int roll;
    String name;
    int marks;
    Student(int roll , String name , int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}
public class ArrayObj {
    public static void main(String[] args){
        Student stud[] = new Student[4];
        Student s1 = new Student(4 , "Zeta" , 85);
        stud[0] = new Student(1 , "Alpha" , 55);
        stud[1] = new Student(2 , "Beta" , 65);
        stud[2] = new Student(3 , "Gamma" , 75);
        stud[3] = s1;
        for(int i=0 ; i<stud.length ; i++){
            System.out.println(stud[i].name+ " : "+stud[i].marks);
        }
        //enhanced for loop we can use same as foreach loop used in integer
        for(Student s : stud){
            System.out.println(s.name+ " : "+s.marks);
        }
    }
}
