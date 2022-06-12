<?php
    require_once('car.php');
    class UberPool extends Car{
        public $brand;
        public $model;

        public function __construct($license, $driver, $model, $brand) {
            parent::__construct($license, $driver);
            $this->model = $model;
            $this->brand = $brand;
        }
    }
?>