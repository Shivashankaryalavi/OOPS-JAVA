class Constructor{
    String name;
    int rollno;
    float marks;

    Constructor(String name,int rollno,float marks){
        this.name =name;
        this.rollno=rollno;
        this.marks=marks;
    }
    void display(){
      System.out.println("Name :" + name + " "+ "rollno : " + " "+ "Marks : " + marks);
    }

    public static void main(String[] args) {
        Constructor c = new Constructor("Basaveshwar" , 111,100f);
        c.display();
        
    }
}