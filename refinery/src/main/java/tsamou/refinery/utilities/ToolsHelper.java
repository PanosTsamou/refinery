package tsamou.refinery.utilities;

import tsamou.refinery.models.Tools;

import javax.tools.Tool;

public class ToolsHelper {
    public static void updateTools(Tools toolToBeUpdated, Tools tool){
        toolToBeUpdated.setName(tool.getName());
        toolToBeUpdated.setSize(tool.getSize());
        toolToBeUpdated.setStock(tool.getStock());
        toolToBeUpdated.setStock_level(tool.getStock_level());
        toolToBeUpdated.setType(tool.getType());
    }
}
