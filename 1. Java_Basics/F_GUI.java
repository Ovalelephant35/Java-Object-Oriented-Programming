import javax.swing.JOptionPane;
public class F_GUI {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter Your Name : ");
        JOptionPane.showMessageDialog(null , "Your name is "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age : "));
        JOptionPane.showMessageDialog(null, "Your age is "+age);
    }
    
}
