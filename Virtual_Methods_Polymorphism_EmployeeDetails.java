/*
Demonstrate polymorphism
Example of virtual methods
 */
package polymorphismdemo;

/**
 *
 * @author Novjean
 */
public class PolymorphismDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        Salary s = new Salary("Nova J", "Jackson, FL" , 3, 100000.00);
        Employee e = new Salary("Jon Doe", "Purdue, IN", 5, 500000.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\nCall mailCheck using Employee reference -- ");
        e.mailCheck();                      // this would still end up running the mailcheck in salary// virtual methods
    }
    
}
class Employee{
    private String name;
    private String address;
    private int number;
    
    public Employee(String name, String address, int number){
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    
    public void mailCheck(){
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }
    
    public String toString(){
        return name + " " + address + " " + number;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String newAddress){
        address = newAddress;
    }
    
    public int getNumber(){
        return number;
    }
  
}

class Salary extends Employee{
    private double salary;
    
    public Salary(String name, String address, int number, double salary){
        super(name,address,number);                     //geting access to the variables in the super class?
        setSalary(salary);
    }
    
    public void setSalary(double newSalary){
        if(newSalary >= 0.0){
            salary = newSalary;
        }
    }
    
    public void mailCheck(){
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " +getName() + " with salary " + salary);
    }
    
    public double getSalary(){
        return salary;
    }
    
    public double computePay(){
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}
