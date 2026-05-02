package Encapsulation;

public class Employee {
    private String name;
    private int empId;
    private double salary;

    Employee(String name,int empId,double salary){
        this.name=name;
        this.empId=empId;
       if(salary>0){
        this.salary=salary;
       }
       else{
        System.out.println("Invalid salary");
        this.salary =0;
       }
    }
    public void setSalary(double salary){
        if(salary >0){
            this.salary=salary;
        }
        else{
            System.out.println("Invalid salary");
        }
    }
    public double getSalary(){
        return salary;

    }
    public String getName(){
        return name;
    }
    public int getEmpId(){
        return empId;

    }
    public static void main(String[] args) {
        Employee e = new Employee("ShivaBasava", 119, 62500);

        System.out.println(e.getName());
        System.out.println(e.getEmpId());
        System.out.println(e.getSalary());
    }
    
}
