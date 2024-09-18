package tsamou.refinery.utilities;

import tsamou.refinery.models.WorkPermit;

public class WorkPermitHelper {

    public static void updateWorkPermit(WorkPermit workPermitToBeUpdated, WorkPermit workPermit){
        workPermitToBeUpdated.setDate(workPermit.getDate());
        workPermitToBeUpdated.setId(workPermit.getId());
        workPermitToBeUpdated.setBronze_tools(workPermit.getBronze_tools());
        workPermitToBeUpdated.setApplicant(workPermit.getApplicant());
        workPermitToBeUpdated.setGas_detector(workPermit.getGas_detector());
        workPermitToBeUpdated.setPer_num(workPermit.getPer_num());
        workPermitToBeUpdated.setSafety_equipment(workPermit.getSafety_equipment());
        workPermitToBeUpdated.setWorkingOrder(workPermit.getWorkingOrder());
        workPermitToBeUpdated.setWork_status(workPermit.getWork_status());
        workPermitToBeUpdated.setApprovals(workPermit.getApprovals());

//        workPermitToBeUpdated.setUnit_approved(workPermit.getUnit_approved());
//        workPermitToBeUpdated.setUnit_notes(workPermit.getUnit_notes());
//        workPermitToBeUpdated.setUnit_approval(workPermit.getUnit_approval());
//        workPermitToBeUpdated.setSupervisor_approval(workPermit.getSupervisor_approval());
//        workPermitToBeUpdated.setSupervisor_notes(workPermit.getSupervisor_notes());
//        workPermitToBeUpdated.setSupervisor_approved(workPermit.getSupervisor_approved());
    }
}
