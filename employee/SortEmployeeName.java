//sort the Names of Employee based on their Names
import java.util.*;
import java.util.stream.*;
class SortEmployeeName{

    public static void main(String Args[]){
        
        List<Employee> empList = Arrays.asList(
            //Employee(name, Age,salary, city)
            new Employee("John",21,1000,"New York"),
            new Employee("Max", 32,2000,"Israel"),
            new Employee("Bhupender",27,5000,"US"), 
            new Employee("Rob",17,5000,"US"),
            new Employee("Cooper",16,5000,"US")
        );
        Employee.displayEmployees(empList);

       // using Traditional Way 
    //sorting list using Collections with Comparator for names
        Collections.sort(empList,new Comparator<Employee>(){
            @Override 
            public int compare(Employee emp1,Employee emp2){
                String empName1=emp1.getEmployeeName();
                String empName2=emp2.getEmployeeName();

                return empName1.compareTo(empName2);
            }
        });
        Employee.displayEmployees(empList);


        ///using Streams API
        List<Employee> result =empList.stream().sorted((emp1,emp2)->emp1.getEmployeeName().compareTo(emp2.getEmployeeName())).collect(Collectors.toList());
        
        Employee.displayEmployees(result);

    }
}