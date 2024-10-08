package tsamou.refinery.utilities;

import tsamou.refinery.models.WorkingOrder;

public class WorkingOrderHelper {

    public static void updateWorkingOrder (WorkingOrder workingOrderToBeUpdated, WorkingOrder workingOrder){
        workingOrderToBeUpdated.setDate(workingOrder.getDate());
        workingOrderToBeUpdated.setOrderNumber(workingOrder.getOrderNumber());
        workingOrderToBeUpdated.setTitle(workingOrderToBeUpdated.getTitle());
        workingOrderToBeUpdated.setDescription(workingOrder.getDescription());
        workingOrderToBeUpdated.setId(workingOrder.getId());
        workingOrderToBeUpdated.setDepartment(workingOrder.getDepartment());
        workingOrderToBeUpdated.setOrderBy(workingOrder.getOrderBy());
        workingOrderToBeUpdated.setWorkPermit(workingOrder.getWorkPermit());
    }
}
