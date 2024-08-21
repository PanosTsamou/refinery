package tsamou.refinery.utilities;

import tsamou.refinery.models.Department;
import tsamou.refinery.models.Unit;

public class UnitHelper {

    public static void updateUnit (Unit unitToBeUpdated, Unit unit){
        unitToBeUpdated.setName(unit.getName());
        unitToBeUpdated.setNumber(unit.getNumber());
    }


}
