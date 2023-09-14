//let say we have to use import there are two types implicit and explicit imports of file
//Also when you import any file they are only imported on the surface but not there subclasses
//here pattern is contained in the java-->util-->regex file so we have import all of them 
import java.util.regex.*;
public class File_import {
    public static void main(String[] args){
        Pattern p = Pattern.compile("ab");
        System.out.println(p);
    }
}
