public class Inheritance {

    public static void main(String[] args) {
        Employee empObj = new Employee("xyz",23,"9876543210","mmm street",25000,"Web development");
        Manager manObj = new Manager("abc",39,"6789054321","nnn street",50000,"Testing");
        
        System.out.println("Employee salary");
        empObj.printSalary();
        
        System.out.println("Manager salary");
        manObj.printSalary();
    }
    
}
class Member{
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    
    public Member(String name,int age,String phoneNumber,String address,double salary){
        this.name = name;
        this.age =age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    void printSalary(){
        System.out.println("Salary :"+salary);
    }
}

class Employee extends Member{
    String specialization;
    Employee(String name,int age,String phoneNumber,String address,double salary,String specialization){
        super(name,age,phoneNumber,address,salary);
        this.specialization = specialization;
        
    }
}

class Manager extends Member{
    String department;
    Manager(String name,int age,String phoneNumber,String address,double salary,String department){
    super(name,age,phoneNumber,address,salary);
        this.department = department;
    }
}