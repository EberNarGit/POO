class Car {
    constructor(id, license, driver, passenger) {
        this.id = id;
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
    }
    printDataCar() {
        console.log(this.id);
        console.log(this.license);
        console.log(this.driver);
        console.log(this.passenger);
    }
}

