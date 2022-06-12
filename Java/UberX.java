package Java;
class UberX extends Car{
    String brand;
    String model;
    
    public UberX(Integer id, String license, String driver, Integer passenger, String brand, String model) {
        super(id, license, driver, passenger);
        this.brand = brand;
        this.model = model;
    } 
}