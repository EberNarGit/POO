package Java;

class Car {
    Integer id;
    String license;
    String driver;
    Integer passenger;

    public Car(Integer id, String license, String driver, Integer passenger){
        this.id = id;
        this.license = license;
        this.driver = driver;
        this. passenger = passenger;
    }

    void printDataCar () {
        System.out.println("License: " + license + ". Driver: " + driver + ". Passenger: " + passenger);
    }
}
