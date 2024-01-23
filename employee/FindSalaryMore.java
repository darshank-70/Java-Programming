///find employees whose Salary is More than 4500

import java.util.*;
import java.util.stream.*;

class FindSalaryMore{

    public static void main(String[] args){

         List<Employee> empList = Arrays.asList(
            //Employee(name, Age,salary, city)
            new Employee("John",21,1000,"New York"),
            new Employee("Max", 32,2000,"Israel"),
            new Employee("Bhupender",45,5000,"US"),
            new Employee("Rob",17,5000,"US"),
            new Employee("Cooper",32,4501,"US"),
            new Employee("Ashok",16,1000,"India"),
            new Employee("Bup",44,5000,"India"),
            new Employee("Alex",12,3999,"US"),
            new Employee("Cooper",30,4500,"US")
        );
        Employee.displayEmployees(empList);

        
    //Traditional way:
        //Iterate through all Elements and find 
        List<Employee> moreSalary = new ArrayList<>();
        for(Employee emp: empList){
            if(emp.getEmployeeSalary()>4500) moreSalary.add(emp);
        }

        Employee.displayEmployees(moreSalary);


    //Using Streams API
        //Apply filter(Predicate<>)
        moreSalary=empList.stream().filter(emp->emp.getEmployeeSalary()>4500).collect(Collectors.toList());

        Employee.displayEmployees(moreSalary);
    }
    
}