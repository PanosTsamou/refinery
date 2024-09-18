package tsamou.refinery.utilities;

import tsamou.refinery.models.Actuator;

public class ActuatorHelper {

    public static void updateActuator(Actuator actuatorToBeUpdated, Actuator actuator){
        actuatorToBeUpdated.setBrand(actuator.getBrand());
        actuatorToBeUpdated.setModel(actuator.getModel());
        actuatorToBeUpdated.setName(actuator.getName());
        actuatorToBeUpdated.setType(actuator.getType());
        actuatorToBeUpdated.setStocking(actuator.getStocking());
        actuatorToBeUpdated.setYear(actuator.getYear());
        actuatorToBeUpdated.setValue(actuator.getValue());
        actuatorToBeUpdated.setStockLevel(actuator.getStockLevel());
        actuatorToBeUpdated.setSection(actuator.getSection());
    }
}
