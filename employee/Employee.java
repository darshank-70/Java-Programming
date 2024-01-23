
import java.util.*;


public class Employee{
    private String eName;
      private int eAge;
      private  double  eSalary;
      private String  eCity;

    public Employee(String eName,int  eAge,double eSalary,String  eCity ){
        this.eName = eName;
        this.eAge=eAge;
        this.eSalary=eSalary;
        this.eCity=eCity;
    }
   
void setEmployeeName(String employeeName ){
    eName=employeeName;
}
  void setEmployeeAge(int age){
    eAge=age;
}
  void setEmployeeCity(String employeeCity){
    eCity = employeeCity;
  }
void setEmployeeSalary(double employeeSalary){
    eSalary = employeeSalary;
  }
  String getEmployeeName(){
    return this.eName;
  }
  int getEmployeeAge(){
    return this.eAge;
  }
  double getEmployeeSalary(){
    return this.eSalary;
  }
  String getEmployeeCity(){   
    return this.eCity;
  }
  static void displayEmployees(List<Employee> allEmployees){
    if(!allEmployees.isEmpty()){
      for(Employee employee : allEmployees){
        System.out.println("["+employee.getEmployeeName() + " " + employee.getEmployeeAge()+" " + 
        " "+employee.getEmployeeSalary() + " " + employee.getEmployeeCity()+ "]");
      }
      System.out.println("-----------------------"); 
    }
  }
}