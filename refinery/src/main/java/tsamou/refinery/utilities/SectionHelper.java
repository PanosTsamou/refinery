package tsamou.refinery.utilities;

import tsamou.refinery.models.Section;

public class SectionHelper {
    public static void  updateSection(Section sectionToBeUpdated, Section section){
        sectionToBeUpdated.setName(section.getName());
        sectionToBeUpdated.setTanks(section.getTanks());
        sectionToBeUpdated.setId(section.getId());
        sectionToBeUpdated.setMeters(section.getMeters());
        sectionToBeUpdated.setActuators(section.getActuators());
        sectionToBeUpdated.setUnit(section.getUnit());
    }
}
