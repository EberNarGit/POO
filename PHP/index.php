<?php 
    require_once('Car.php');
    require_once('Account.php');
    require_once('UberX.php');
    require_once('UberPool.php');
    
    $car = new UberX("AAAAAA", new Account("Eber alv", "Documento"),"Mitsubichi","Outlander");
    $car->printDataCar();

    $UberPool = new UberPool("BBBBBB", new Account("Eber alv1", "Documento1"),"Ford","Ranger");
    $UberPool->printDataCar();
?>