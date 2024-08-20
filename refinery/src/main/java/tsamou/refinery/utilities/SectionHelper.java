package tsamou.refinery.utilities;

import tsamou.refinery.models.Section;

public class SectionHelper {
    public static void  updateSection(Section sectionToBeUpdated, Section section){
        sectionToBeUpdated.setName(section.getName());

    }
}
