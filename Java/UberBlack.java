package Java;

import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car{
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    
    public UberBlack(Integer id, String license, String driver, Integer passenger,  Map<String, Map<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial) {
        super(id, license, driver, passenger);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}
