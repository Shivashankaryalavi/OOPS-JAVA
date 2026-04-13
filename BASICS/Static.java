public class Static {
    String name;
    int age;
    String subject;
    static String university="Visveswarayy Technological university";

    Static(String name,int age,String subject){
              this.name=name;
              this.age=age;
              this.subject = subject;;
           
    }
    void display(){
        System.out.println("Name : "+ name +"\n"+ "Age : "+ " " + age +"\n"+ "Subject : "+ subject + "\n" +"University : "+ " "+ Static.university);
    }
    public static void main(String[] args) {
       Static s = new Static("Shivashankar", 22, "OOPs");
        s.display();
      Static s1 = new Static("Shiva", 23, "Java");
      s1.display();
    }
}
