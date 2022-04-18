package com.x.pattern.responsibility;

/**
 * 小组长类
 * @author Yiqi Li
 */
public class GroupLeader extends Handler {
    public GroupLeader() {
        super(0, Handler.LEVEL_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println("Employee name:" + leaveRequest.getEmployeeName());
        System.out.println("Numbers of days off: " + leaveRequest.getDayNum());
        System.out.println("Reason: " + leaveRequest.getReason());
        if (leaveRequest.getDayNum() <= this.getNumEnd()) {
            System.out.println("Group leader: Approve!");
        } else {
            System.out.println("Group leader: No permission!");
        }
    }
}
