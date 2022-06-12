package Java;

class Main{
    public static void main(String[] args){
        System.out.println("Hola mundo");
        Car car = new Car(1, "AMQ123", "Eber Alv", 5);
        car.printDataCar();

        Car car2 = new Car(2, "ZCV526", "Pepe Lva", 8);
        car2.printDataCar();
    }
}