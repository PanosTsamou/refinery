package tsamou.refinery.utilities;

import tsamou.refinery.models.Tank;

public class TankHelper {
    public static void updateTank (Tank tankToBeUpdated, Tank tank){
        tankToBeUpdated.setName(tank.getName());
        tankToBeUpdated.setType(tank.getType());
        tankToBeUpdated.setStoring(tank.getStoring());
        tankToBeUpdated.setVolume(tank.getVolume());
    }
}
