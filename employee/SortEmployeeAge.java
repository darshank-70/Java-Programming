
import java.util.*;
import java.util.stream.*;

class SortEmployeeAge{
     
    public static void main(String[] args){

        List<Employee> empList = Arrays.asList(
            //Employee(name, Age,salary, city)
            new Employee("John",21,1000,"New York"),
            new Employee("Max", 32,2000,"Israel"),
            new Employee("Bhupender",27,5000,"US"),
            new Employee("Rob",17,5000,"US"),
            new Employee("Cooper",16,5000,"US")
        );
        Employee.displayEmployees(empList);

        //to sort the list of Employees abased on their Age:
        //Traditional Way: 
       
        // Collections.sort(empList,new Comparator<Employee>(){
        //     @Override
        //     public int compare(Employee emp1, Employee emp2){
        //         return emp1.getEmployeeAge()-emp2.getEmployeeAge();//sort in Ascending Age
        //     }
        // });
        //Employee.displayEmployees(empList);
       
       
        //using Lambda for above method
        // Collections.sort(empList,(a,b)->a.getEmployeeAge()-b.getEmployeeAge());
        // Employee.displayEmployees(empList);
       


       //Using Streams API

        List<Employee> sortedAgeEmployees=empList.stream().sorted((emp1,emp2)->emp1.getEmployeeAge()-emp2.getEmployeeAge()).collect(Collectors.toList());

        Employee.displayEmployees(sortedAgeEmployees);
     }
}