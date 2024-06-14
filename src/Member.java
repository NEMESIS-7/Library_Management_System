import java.util.*;
public class Member {
    Scanner input = new Scanner(System.in);
    private String ID;
    private String Name;
    private String Email;

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
        //displaying member information

    public void displayInfo(){
        System.out.println("ID: " + ID);
        System.out.println("Name: " + Name);
        System.out.println("Email: " + Email);
    }

    //constructor
    public Member(String name, String ID, String email) {
        this.ID = ID;
        this.Name = name;
        this.Email = email;
    }
}

class Reader extends Member{
   public Reader(String name, String ID, String email) {
       super(name, ID, email); //constructor
   }

   //displaying reader information
    public void displayInfo(){
        System.out.println("Reader information:  ");
        super.displayInfo();
    }
}

class Employee extends Member{
    private String employeeID;
    public String getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    //method to take employee information
    public Employee(String name, String ID, String email) {
        super(name, ID, email);        //calling the constructor of the super class member
        System.out.println("enter your employee ID: ");
        this.employeeID = input.nextLine();

    }
    //method  to display user information

    public void displayInfo(){
        System.out.println("Employee information:  ");
        System.out.println("Employee ID: " + employeeID);
        super.displayInfo();

    }
}
