package tsamou.refinery.utilities;


import tsamou.refinery.models.Unit;

public class UnitHelper {

    public static void updateUnit (Unit unitToBeUpdated, Unit unit){
        unitToBeUpdated.setName(unit.getName());
        unitToBeUpdated.setNumber(unit.getNumber());
        unitToBeUpdated.setId(unit.getId());
        unitToBeUpdated.setSections(unit.getSections());
        unitToBeUpdated.setEmployees(unit.getEmployees());
    }


}
