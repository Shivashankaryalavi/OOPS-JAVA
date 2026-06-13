

public class Students {
    int id;
    String name;    
    void input(){
        System.out.println("Enter the id and name of the student");
    }
    
}
class Shiva extends Students{
        void display(){
            id =1;name="Shiva";
        System.out.println("The id and name of the student is: "+id+" "+name);
    }
    public static void main(String[] args) {
        Shiva s = new Shiva();
        s.input();
       
        s.display();
    }
}
