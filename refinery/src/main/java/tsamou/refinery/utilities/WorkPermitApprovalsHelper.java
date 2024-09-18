package tsamou.refinery.utilities;

import tsamou.refinery.models.WorkPermitApprovals;

public class WorkPermitApprovalsHelper {
    public static void updateWorkPermitApprovals (WorkPermitApprovals approvalToBeUpdated, WorkPermitApprovals approval){
        approvalToBeUpdated.setApproved(approval.getApproved());
        approvalToBeUpdated.setDescription(approval.getDescription());
        approvalToBeUpdated.setAuthorizer(approval.getAuthorizer());
        approvalToBeUpdated.setId(approval.getId());
        approvalToBeUpdated.setWorkPermit(approval.getWorkPermit());
    }
}
