public class Student {
    String name;
    int rollno;
    float marks;

    Student(){
        this("unknown",0,0.0f);
        System.out.println("Default constructor");
    }
    
    Student(String name,int rollno,float marks){
        this.name=name;
        this.marks=marks;
        this.rollno=rollno;
        System.out.println("Parameterized constructor");
        
        
    }
    void display(){
        System.out.println("Name :"+ name +" "+" rollno : "+rollno+ " "+ "marks : "+ marks);

    }
    
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        Student s1 = new Student("Basaveshwar",111,100f);
        s1.display();
        Student s2 = new Student ("Shivayogi",111,100f);
        s2.display();
        
       
    
    }
    
}
