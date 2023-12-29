public class SalaryProgram {

    public static void main(String[] args) {
       ManagerClass manObj = new ManagerClass(111,"XYZ",5);
       DeveloperClass devObj = new DeveloperClass(201,"ABC","C++");
       
       System.out.println("MANAGER OBJECT");
       System.out.println("Name : "+manObj.getName()+"\nSalary :"+Math.round(manObj.calculateSalary()));
       System.out.println("DEVELOPER OBJECT");
       System.out.println("Name : "+devObj.getName()+"\nSalary :"+devObj.calculateSalary());
    }
    
}
class EmployeeClass{
    int employeeId;
    String employeeName;
    
    EmployeeClass(int employeeId,String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    double calculateSalary(){
        return 50000;
    }
    String getName(){
        return employeeName;
    }
}
class ManagerClass extends EmployeeClass{
    float bonusPercentage;
    public ManagerClass(int employeeId, String employeeName,float bonusPercentage) {
        super(employeeId, employeeName);
        this.bonusPercentage = bonusPercentage;
    }
    
    @Override
    double calculateSalary(){
        double basicSalary = super.calculateSalary();
        return basicSalary + (basicSalary*(bonusPercentage/100));
    }
}

class DeveloperClass extends EmployeeClass{
    String programmingLanguage;

    public DeveloperClass(int employeeId, String employeeName,String programmingLanguage) {
        super(employeeId, employeeName);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    double calculateSalary(){
        double basicSalary = super.calculateSalary();
        double allowance = 1000;
        return basicSalary + allowance;
    }
}