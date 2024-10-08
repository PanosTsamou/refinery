package tsamou.refinery.utilities;

import tsamou.refinery.models.ToolBox;

public class ToolBoxHelper {
    public static void updateTools(ToolBox toolBoxToBeUpdated, ToolBox toolBox){
        toolBoxToBeUpdated.setTools(toolBox.getTools());
        toolBoxToBeUpdated.setId(toolBox.getId());
        toolBoxToBeUpdated.setEmployees(toolBox.getEmployees());
    }
}
