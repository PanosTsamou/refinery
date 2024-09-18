package tsamou.refinery.utilities;

import tsamou.refinery.models.Meter;

public class MeterHelper {

    public static void updateMeter(Meter meterToBeUpdated, Meter meter){
        meterToBeUpdated.setBrand(meter.getBrand());
        meterToBeUpdated.setKind(meter.getKind());
        meterToBeUpdated.setModel(meter.getModel());
        meterToBeUpdated.setName(meter.getName());
        meterToBeUpdated.setStatus(meter.getStatus());
        meterToBeUpdated.setStock(meter.getStock());
        meterToBeUpdated.setStock_level(meter.getStock_level());
        meterToBeUpdated.setYear(meter.getYear());
        meterToBeUpdated.setType(meter.getType());
        meterToBeUpdated.setValue(meter.getValue());
        meterToBeUpdated.setSection(meter.getSection());

    }
}
