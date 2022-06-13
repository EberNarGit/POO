package Java;

class User extends Account{
    public User(Integer id, String name, String document, String email, String password){
        super(id, name, document, email, password);
    }
}

// package Java;
// class UberX extends Car{
//     String brand;
//     String model;
    
//     public UberX(Integer id, String license, String driver, Integer passenger, String brand, String model) {
//         super(id, license, driver, passenger);
//         this.brand = brand;
//         this.model = model;
//     } 
// }