package Encapsulation;

public class Student {

    private String name;
    private int Id;
    private int marks;

    Student(String name,int Id,int marks){
        this.name=name;
        this.Id=Id;
        if(marks>=0 && marks<=100){
            this.marks=marks;
        }
        else{
            System.out.println("Invalid marks");
            this.marks=0;
        }
    }
    public void setMarks(int marks){
        if(marks>=0 && marks <=100){
            this.marks=marks;
        }
        else{
            System.out.println("Invalid marks");
        }
    }
    public String calculateGrade(){
        if(marks>=90){
            return "A";
        }
        else if(marks>=75){
            return "B";
        }
        else if(marks>=50){
            return "C";
        }
        else{
            return "Fail";
        }

    }
    public boolean isPass(){
        return marks>=50;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public int getId(){
        return Id;
    }
    public static void main(String[] args) {
        Student s = new Student("Basaveshwar", 119,97);
        Student s1= new Student("Shivayogi", 120, 98);

        System.out.println("Student 1 details");
        System.out.println(s.getName());
        System.out.println(s.getId());
        s.setMarks(99);
        System.out.println(s.getMarks());
        System.out.println("Grade : "+ s.calculateGrade());
        System.out.println("Result :" + (s.isPass() ? "Pass" : "Fail"));
        System.out.println("\n");

        System.out.println("Student 2 details");
        System.out.println(s1.getName());
        System.out.println(s1.getId());
        System.out.println(s1.getMarks());
        System.out.println("Grade : "+ s1.calculateGrade());
        System.out.println("Result : "+ (s1.isPass()? "Pass" : "Fail"));
    }
    
    
}
