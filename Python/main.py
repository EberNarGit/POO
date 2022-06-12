from car import Car
from account import Account

if __name__ == "__main__":
    print ("Hola mundo");
    car = Car(1,"ALV456", Account(1,"Conductor eber","credencial eber","email eber","constraseña eber"),8)
    print(vars(car))
    print(vars(car.driver))