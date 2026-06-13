public class Demo1 {
    int a = 10;
    String name = "Shivashankar";
    void display(){
        System.out.println("Value of a: " + a);
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.display();
    }
}
