<?php 
    require_once('Car.php');
    require_once('Account.php');
    require_once('UberX.php');
    require_once('UberPool.php');
    require_once('UberVan.php');

    $uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "AND456"), "Nissan", "Versa");
    $uberVan->setPassenger(6);
    $uberVan->printDataCar();

    $uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
    $uberX->setPassenger(4);
    $uberX->printDataCar();
?>