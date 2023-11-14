class Person {

    public String name;
    private int age;
    private String address;
    public static int num_of_people;

    public Person(String name, int age) { // Constructor
        this.name = name;
        this.age = age;
        this.address = "NOT SET";
        num_of_people++;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int setAddress(String adr) {
        this.address = adr;
        return 0;
    }

    public String getAddress() {
        return this.address;
    }

    public void birthday() {
        this.age++;
    }

    public String toString() {
        return "Hi! Welcome to OOP. \nI'm " + this.name + " and am " + this.age + " years old.";
    }
}



class BankAccount {

    private Person owner; // Object of the Person Class as a field
    private int balance;
    // private String logger; // This stores the last transaction in a String (Eg: "Transferred Rs. 100",
                           // "Deposited Rs. 1000")
    static final int MIN_BALANCE = 1000; // This is the minimum balance needed for making a transaction
    private static int num_of_banks; // Update the number of banks each time a bank is created

    public BankAccount(Person owner, int initialBal) {
        this.owner = owner;
        this.balance = initialBal;
        num_of_banks++;
    }

    public BankAccount(String ownerName, int ownerAge, int initialBal) {
        this.owner = new Person(ownerName , ownerAge);
        this.balance = initialBal;
        num_of_banks++;
    }

    public String getOwnerName() {
        return owner.name;
    }

    public int getOwnerAge() {
        return owner.getAge();
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        if(amount>0)balance+=amount;
        
    }

    public int withdraw(int amount) {
        if(balance-MIN_BALANCE<amount)return -1;
        balance-=amount;
        return 0;
    }

    public int transfer(int amount, BankAccount other) {
        if(balance-MIN_BALANCE<amount)return -1;
        balance-=amount;
        other.balance+=amount;
        return 0;
    }


    public String toString() {
        return "HELLO";
    }

    public static void aboutBank() {
        System.out.println("Hello I am the Bank.\n" + "I have " + num_of_banks + " bank(s) registered.");
    }
}


public class BankProb{
    public static void main(String[] args) {
        Person p1 = new Person("Adam", 25);
        System.out.println(p1 + "\n"); // What method of the Person is being used here?

        Person p2 = new Person("John", 20);
        p2.setAddress("BITS GOA");

        System.out.println("Number of People: " + Person.num_of_people + "\n");

        BankAccount.aboutBank();
        System.out.println();

        BankAccount b1 = new BankAccount(p2, 1000);
        BankAccount b2 = new BankAccount("Adam" , 25 , 500);
        System.out.println(b1);

        System.out.println(b1.getOwnerName());
        b1.deposit(1000);
        System.out.println(b1.getBalance());
        b1.withdraw(100);
        b1.transfer(8000 , b2);
        System.out.println(b1.getBalance());
        System.out.println();
        System.out.println();
        System.out.println(b2.getOwnerName());
        b2.deposit(1000);
        System.out.println(b2.getBalance());
        b2.withdraw(200);
        System.out.println(b2.getBalance());
        b1.transfer(800 , b2);
        BankAccount.aboutBank();
    }
}