class Car{
    String brand;
    Engine engine;
    Car(String brand){
        this.brand =brand;
        engine =new Engine("petrol");
    }
    void startCar(){
        engine.startEngine();
        System.out.println("car started and brand of car is" + brand);
    }
    public static void main(String[] args) {
        Car c = new Car("bmw");
        c.startCar();
    }
}