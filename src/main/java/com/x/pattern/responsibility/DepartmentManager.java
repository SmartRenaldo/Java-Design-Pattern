package com.x.pattern.responsibility;

/**
 * 部门经理类
 *
 * @author Yiqi Li
 */
public class DepartmentManager extends Handler {
    public DepartmentManager() {
        super(Handler.LEVEL_ONE, Handler.LEVEL_TWO);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println("Employee name:" + leaveRequest.getEmployeeName());
        System.out.println("Numbers of days off: " + leaveRequest.getDayNum());
        System.out.println("Reason: " + leaveRequest.getReason());
        if (leaveRequest.getDayNum() <= this.getNumEnd()) {
            System.out.println("Department manager: Approve!");
        } else {
            System.out.println("Department manager: No permission!");
        }
    }
}
